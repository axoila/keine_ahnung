package application;

import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Fenster extends Stage {
	GraphicsContext gc;
	public Fenster() {
		 StackPane root = new StackPane ();
			Canvas canvas = new Canvas (300, 300);
			root.getChildren().add (canvas);
			Scene scene = new Scene (root, 400, 400);
			setScene(scene);
			show ();
			gc = canvas.getGraphicsContext2D();
			
			Timer ticker = new Timer ();
			ticker.scheduleAtFixedRate(new TimerTask() {
				public void run(){
					System.out.println("tick");
				}
			}, 0, 0016);
	}
	
	

}
