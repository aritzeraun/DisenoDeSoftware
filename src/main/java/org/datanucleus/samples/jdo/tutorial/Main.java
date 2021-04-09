package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;
import java.text.SimpleDateFormat;
import java.util.Date;


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
				SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
				Date fecha_alt_Invest = objSDF.parse("20-08-1981 19:03:44");
				Date fecha_creacion_equipo = objSDF.parse("20-01-1981 18:03:44");
				Date fecha__disolucion_equipo = objSDF.parse("20-12-1985 12:04:44");
				Date fecha_fec_comienzo_proyecto = objSDF.parse("23-08-1985 12:03:46");
				Date fecha_fec_ultEdicion_proyecto = objSDF.parse("31-05-1999 13:15:44");
				Date fecha_fec_avance = objSDF.parse("24-08-1998 14:03:44");

				transaction.begin();

			    Organizacion organizacion= new Organizacion ("Deusto", "San Sebastian", "Universidad de Deusto", "Sin animo de lucro");
			    Organizacion organizacion2= new Organizacion("UPV", "San Sebastian", "Universidad del País Vasco", "Sin animo de lucro");
			    Investigador investigador = new Investigador("Amaia", "Zarranz", "Mendizabal", 22, fecha_alt_Invest);
			    Equipo equipo= new Equipo ("Team 5", "The best team", "Alta", fecha_creacion_equipo, fecha__disolucion_equipo);
				Equipo equipo2= new Equipo ("Team 6", "The second best team", "Alta", fecha_creacion_equipo, fecha__disolucion_equipo);
			    Tematica tematica= new Tematica ("Tematica 1", "Area 1");
			    Proyecto proyecto = new Proyecto ("Proyecto 1", "el proyecto uno", "estado", fecha_fec_comienzo_proyecto, fecha_fec_ultEdicion_proyecto);
			    Avance avance=new Avance (fecha_fec_avance);

			    organizacion2.getInvestigador().add(investigador);
			    organizacion.getEquipo().add(equipo);
			    tematica.getProyecto().add(proyecto);
			    equipo.getProyecto().add(proyecto);
				equipo.getEquipo().add(equipo2);
			    investigador.getAvance().add(avance);
			    proyecto.getAvance().add(avance);
			    investigador.getEquipo().add(equipo);
			    equipo.getInvestigador().add(investigador);

			    persistentManager.makePersistent(organizacion);
			    persistentManager.makePersistent(organizacion2);
			    persistentManager.makePersistent(tematica);
				persistentManager.makePersistent(equipo);
				persistentManager.makePersistent(equipo2);
				persistentManager.makePersistent(investigador);
				persistentManager.makePersistent(proyecto);

				//System.out.println("- Inserted into db: " + investigador.nombre);

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
			        //System.out.println("- Selected from db: " + investigador.nombre);
			        //si quitas estas dos lineas podemos ver el resultado en la bd
			        //persistentManager.deletePersistent(investigador);
			        //System.out.println("- Deleted from db: " + investigador.nombre);
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