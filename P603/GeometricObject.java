package P603;
import java.util.Date;

public class GeometricObject {
	private String color;
	private boolean isFilled;
	private Date createTime;
	
	public GeometricObject(String color, boolean isFilled) {
		super();
		this.color = color;
		this.isFilled = isFilled;
		this.createTime = new Date();
	}
	
	public GeometricObject()
	{
		this.color="WHITE";
		this.isFilled=false;
		this.createTime=new Date();
	}
	//getters and setters 
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return isFilled;
	}
	
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Override
	public String toString()
	{
		
		return "color: "+this.color+" isFilled: "+isFilled+" CreatingTime: "+createTime;
	}


}

