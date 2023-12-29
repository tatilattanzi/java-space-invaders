import javax.swing.ImageIcon;

/**
 * 
 * @author 
 */
public class Won extends Sprite implements Commons{

	/** The path to the image file for the victory screen */
	private final String won = "/img/won.jpg";

	/** The width of the victory screen image. */
	private int width;
	
	/*
     	* Constructs a new Won object. Loads the victory screen image and sets initial position.     */
    	public Won() {
		// Load the victory screen image    
        	ImageIcon ii = new ImageIcon(this.getClass().getResource(won));
	
		// Set the width of the image
        	width = ii.getImage().getWidth(null); 

        	setImage(ii.getImage());
        	setX(0);
        	setY(0);
    	}

    	/*
     	* Gets the width of the victory screen image.
	* @return The width of the image.
     	*/
	public int getWidth() {
		return width;
	}
	/**
	* Sets the width of the victory screen image
	*
	* @param width The new width to set.
	*/
	public void setWidth(int width) {
		this.width = width;
	}
}
