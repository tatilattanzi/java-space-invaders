import javax.swing.ImageIcon;

/**
 * 
 * @author 
 */
public class Won extends Sprite implements Commons{
    private final String won = "/img/won.jpg";
    private int width;

    /*
     * Constructor
     */
    public Won() {

        ImageIcon ii = new ImageIcon(this.getClass().getResource(won));

        width = ii.getImage().getWidth(null); 

        setImage(ii.getImage());
        setX(0);
        setY(0);
    }

    /*
     * Getters & Setters
     */
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
