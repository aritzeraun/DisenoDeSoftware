package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

public class Main {

	public static void main(String[] args)
	{

		try
        {
			PersistenceManagerFactory persistentManagerFactory = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
			PersistenceManager persistentManager = persistentManagerFactory.getPersistenceManager();				
			Transaction transaction = persistentManager.currentTransaction();

			try
            {

			    transaction.begin();

			    Organizacion organizacion= new Organizacion ("Deusto", "San Sebastian", "Universidad de Deusto", "Sin animo de lucro");
			    Organizacion organizacion2= new Organizacion("UPV", "San Sebastian", "Universidad del País Vasco", "Sin animo de lucro");
			    Investigador investigador = new Investigador("Amaia", "Zarranz", "Mendizabal", 22, "Mujer");
			    Equipo equipo= new Equipo ("Team 5", "The best team", "Alta");
			    Tematica tematica= new Tematica ("Tematica 1", "Area 1");
			    Proyecto proyecto = new Proyecto ("Proyecto 1", "el proyecto uno", "estado");
			    Avance avance=new Avance ();


			    organizacion2.getInvestigador().add(investigador);
			    organizacion.getEquipo().add(equipo);
			    tematica.getProyecto().add(proyecto);
			    equipo.getProyecto().add(proyecto);
			    investigador.getAvance().add(avance);
			    proyecto.getAvance().add(avance);
			    investigador.getEquipo().add(equipo);
			    equipo.getInvestigador().add(investigador);

			    persistentManager.makePersistent(organizacion);
			    persistentManager.makePersistent(organizacion2);
			    persistentManager.makePersistent(tematica);
				persistentManager.makePersistent(equipo);
				persistentManager.makePersistent(investigador);
				persistentManager.makePersistent(proyecto);

				System.out.println("- Inserted into db: " + investigador.nombre);

			    transaction.commit();
			    
			}

            catch(Exception ex)
			{
				System.err.println("* Exception inserting data into db: " + ex.getMessage());
			}
			
			finally
			{		    
				if (transaction.isActive()) 
				{
			        transaction.rollback();
			    }
			    
			    persistentManager.close();
			}
			
			
			//Select data using a Query
			persistentManager = persistentManagerFactory.getPersistenceManager();
			transaction = persistentManager.currentTransaction();

			try
            {
			    transaction.begin();

			    @SuppressWarnings("unchecked")
				Query<Investigador> investigadorQuery = persistentManager.newQuery("SELECT FROM " + Investigador.class.getName() + " WHERE edad < 100 ORDER BY edad ASC");

			    for (Investigador investigador : investigadorQuery.executeList())
			    {
			        System.out.println("- Selected from db: " + investigador.nombre);
			        //si quitas estas dos lineas podemos ver el resultado en la bd
			        //persistentManager.deletePersistent(investigador);
			        System.out.println("- Deleted from db: " + investigador.nombre);
			    }

			    transaction.commit();
			}

			catch(Exception ex)
			{
				System.err.println("* Exception executing a query: " + ex.getMessage());
			}

			finally 
			{
				if (transaction.isActive())
				{
			        transaction.rollback();
			    }
	
			    persistentManager.close();
			}
		}

		catch (Exception ex)
        {
			System.err.println("* Exception: " + ex.getMessage());
		}
	}
}