package P701;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class Car extends Pane{
	private double velocity;
	private double Xstart;
	private double Ystart;
	Timeline animation;
	Image car = new Image("p701/car.jpg");
	ImageView carView=new ImageView(car);
	Line l1;
	public Car(double velocity,double Xstart,double Ystart)
	{
		this.Xstart=Xstart;
		this.Ystart=Ystart;
		this.velocity=velocity;
		carView.setScaleX(0.5);
		carView.setScaleY(0.5);
		this.getChildren().add(carView);
		l1=new Line(Ystart,0,1300,Ystart);
		this.getChildren().add(l1);
		animation=new Timeline(new KeyFrame(Duration.millis(50),e->Run()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}
	
	void Run()
	{
		this.Xstart+=velocity*0.5;
		carView.setX(Xstart);
		carView.setY(Ystart);
		//System.out.println("a");
	}
}
