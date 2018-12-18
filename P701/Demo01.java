package P701;


/*
 * ����һ��ģ������������GUIӦ�ó�������ͼ��ʾ��
 * ����������ÿ�������ٶȣ�Ҳ����Ϊÿ������������ٶȡ�
 * �ı��ֶ��е����ֿ��Դ���������ʼ�ĳ�ʼλ�ã�Ҳ���Դ����������ٶȡ�
 * ������ͺ������������κη�ʽ���ı��ֶ��н�����Щ����.
 * */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Demo01 extends Application{
	boolean isSpeed=true;
	private double data1;
	private double data2;
	private double data3;
	private double data4;
	Car c1;
	Car c2;
	Car c3;
	Car c4;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage pstage)
	{
		
		GridPane game =new GridPane();
		Label console =new Label("��ǰģʽ���ٶ�");
		//�����ĸ��������ı���
		Label label1=new Label("Car 1");
		Label label2=new Label("Car 2");
		Label label3=new Label("Car 3");
		Label label4=new Label("Car 4");
		
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		TextField tf4=new TextField();
		
		Button sButton =new Button("��ʼ");
		
		ToggleButton Switch = new ToggleButton("�ٶ�"); //ת��ģʽ
	
		sButton.setStyle("  -fx-base: salmon;    ");
		Switch.setStyle(" -fx-base: lightgreen;  ");
	
		Switch.setOnMouseClicked(e->{
			if(true==isSpeed) {
				isSpeed=false;
				console.setText("��ǰģʽ��λ��(�ٶ����)");
			Switch.setText("λ��");
			}
			else if(false == isSpeed)
			{
				isSpeed=true;
				console.setText("��ǰģʽ���ٶ�");
				Switch.setText("�ٶ�");
			}
		});

		
		sButton.setOnAction(e->{
			data1=Double.parseDouble(tf1.getText());
			data2=Double.parseDouble(tf2.getText());
			data3=Double.parseDouble(tf3.getText());
			data4=Double.parseDouble(tf4.getText());
			
			if(true==isSpeed)
			{
				
				c1=new Car(data1,0,0);
				c2=new Car(data2,0,0);
				c3=new Car(data3,0,0);
				c4=new Car(data4,0,0);
			}
			else if(false == isSpeed)
			{
				int cache=0;
				cache=(int)(Math.round(Math.random()*(52-1)+1));
				c1=new Car(cache,data1,0);
				cache=(int)(Math.round(Math.random()*(52-1)+1));
				c2=new Car(cache,data2,0);
				cache=(int)(Math.round(Math.random()*(52-1)+1));
				c3=new Car(cache,data3,0);
				cache=(int)(Math.round(Math.random()*(52-1)+1));
				c4=new Car(cache,data4,0);		
			}
			game.add(c1,0,1);
			game.add(c2,0,2);
			game.add(c3,0,3);
			game.add(c4,0,4);
		});
		DropShadow shadow = new DropShadow();
		//Adding the shadow when the mouse cursor is on
		Switch.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
		   Switch.setEffect(shadow);
		});
		 
		//Removing the shadow when the mouse cursor is off
		Switch.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
		    Switch.setEffect(null);
		});
		
		HBox Title=new HBox();
		Title.setPadding(new Insets(10));
		Title.setAlignment(Pos.CENTER);
		Title.getChildren().addAll(console,label1,tf1,label2,tf2,label3,tf3,label4,tf4,Switch,sButton);
		Title.setSpacing(20);
		game.add(Title,0,0);
		
		
		Scene sc=new Scene(game,1200,600);
		pstage.setScene(sc);
		pstage.show();
	}

}
