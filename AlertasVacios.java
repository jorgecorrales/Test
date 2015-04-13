package amc.alertasvacios;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import cntm.util.JDBCConnectionFactory;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Calendar;
import javax.mail.*;

public class AlertasVacios {

	// Declaracion de Miembros

	static final logger log = Logger.getLogger(AlertasVacios.class);
	private DataSource ds;
	private Date fecha = new Date();
	private Date fechaComp = new Date();
	Calendar fechaTemp = Calendar.getInstance();
	fechaTemp.setTime(fecha);
	fechaTemp.add(calendar.DATE, 1);
	fechaComp = fechaTemp.getTime();

	//Consultas

	final String articuloVacio = "SELECT p.periodicidad_id, pc.periodicidad, pc.categoria, c.categoria_id, cc.categoria, cc.contenido, co.contenido_id, a.contenido, co.fechadecreacion, a.cuerpocdma, a.cuerpogsm, a.cuerpowap"
				     + "FROM periodicidad p JOIN periodicidad_categoria pc ON p.periodicidad_id = pc.periodicidad JOIN categoria c ON pc.categoria = c.categoria_id JOIN contenido_categoria cc ON c.categoria_id = cc.categoria JOIN contenido co ON cc.contenido = co.contenido_id JOIN articulo a ON co.contenido_id = a.contenido"
				     +  "WHERE (to_char(" + fechaComp + " + 1, 'DD-MM-YYYY') = to_char(co.fechadecreacion, 'DD-MM-YYYY')) AND (a.cuerpocdma = '' OR a.cuerpogsm = '' OR a.cuerpowap = '' )"

	final String prediccionVacio = "SELECT p.periodicidad_id, pc.periodicidad, pc.categoria, c.categoria_id, prc.categoria, prc.prediccion, pr.prediccion_id, pr.fechadecreacion, pr.cuerpocdma, pr.cuerpogsm, pr.cuerpowap"
				     + "FROM periodicidad p JOIN periodicidad_categoria pc ON p.periodicidad_id = pc.periodicidad JOIN categoria c ON pc.categoria = c.categoria_id JOIN prediccion_categoria prc ON c.categoria_id = prc.categoria JOIN prediccion pr ON prc.prediccion = pr.prediccion_id"
				     +  "WHERE (to_char(" + fechaComp + " + 1, 'DD-MM-YYYY') = to_char(pr.fechadecreacion, 'DD-MM-YYYY')) AND (pr.cuerpocdma = '' OR pr.cuerpogsm = '' OR pr.cuerpowap = '' )"

	private void run(){


	Connection cnx = null;

	PreparedStatement stmt1 = null;
	PreparedStatement stmt2 = null;

	try {
		cnx = ds.getConnection();

		stmt1 = cnx.preparedStatement(articuloVacio);		
		ResultSet rset1 = stmt1.executeQuery();

		stmt2 = cnx.preparedStatement(prediccionVacio);		
		ResultSet rset1 = stmt2.executeQuery();

		if (stmt1 != NULL)		

	} catch {


	}
	

	

	public static void main(String[] args){




	}



	}
	
	





}
