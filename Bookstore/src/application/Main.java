package application;
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BookListImpl bookList = new BookListImpl();
		
		URL myUrl = null;
		
			myUrl = new URL("http://www.contribe.se/bookstoredata/bookstoredata.txt" );
		
		URLConnection myUrlConnection = null;
		
			myUrlConnection = myUrl.openConnection();
		
		InputStreamReader inStream = null;
		try {
			inStream = new InputStreamReader(myUrlConnection.getInputStream(),"UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        BufferedReader br= new BufferedReader(inStream);
   
      
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);
        
        // Add books and inventory in database
        String inputLine;
       
			while ((inputLine = br.readLine()) != null) {
			       
			        String[] p = inputLine.split(";");
			        
			        System.out.println(p[0]);
			        bookList.add(new Book(1, p[0].toString(), p[1], 10), Integer.parseInt(p[3]));
			
}
		
}
}
