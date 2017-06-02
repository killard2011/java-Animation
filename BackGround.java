import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;

public class BackGround {
	private Image image;
	  private Component component;
	  private Dimension size;

	  public BackGround(Component component,Image image) {
	  this.component = component;
	  size = component.getSize();
	  this.image = image;
	  }//end construtor
	 
	  public Dimension getSize(){
	  return size;
	  }//end getSize()

	  public Image getImage(){
	  return image;
	  }//end getImage()

	  public void setImage(Image image){
	  this.image = image;
	  }//end setImage()

	  public void drawBackgroundImage(Graphics g) {
	  g.drawImage(image, 0, 0, component);
	  }//end drawBackgroundImage()
}
