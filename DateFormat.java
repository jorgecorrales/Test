import java.util.Calendar;
import java.util.Date;
import java.text.*;

public class DateFormat {


	public static void main(String[] args){

		//Date fechaComp = new Date();		
		Calendar fechaTemp = Calendar.getInstance();
	 	fechaTemp.setTime(new Date());
		fechaTemp.add(Calendar.DATE, 1);
		Date fechaComp = fechaTemp.getTime();
		/**SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
 	        String fechaString = dateFormat.format(fechaComp);*/
	 
		System.out.println(fechaComp);



	}

}
