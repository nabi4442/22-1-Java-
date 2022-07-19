import java.awt.*;

public class GridBagTest extends Frame
{
	public GridBagTest(){
		super("GridBag Test");

		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraint = new GridBagConstraints();
		setLayout(gridbag);

		constraint.fill = GridBagConstraints.BOTH;
		constraint.weightx = 0.0;
		Button b1 = new Button("Button!");
		gridbag.setConstraints(b1, constraint);
		add(b1);

		Button b2 = new Button("Button2");
		gridbag.setConstraints(b2, constraint);
		add(b2);

		constraint.gridwidth = GridBagConstraints.REMAINDER;
		Button b3 = new Button("Button3");
		gridbag.setConstraints(b3, constraint);
		add(b3);

		constraint.gridwidth = 2;
		constraint.gridheight = 3;
		Button b4 = new Button("Button4");
		gridbag.setConstraints(b4, constraint);
		add(b4);
		
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		constraint.gridheight = 1;
		constraint.weighty = 0.0;
		Button b5 = new Button("Button5");
		gridbag.setConstraints(b5, constraint);
		add(b5);

		Button b6 = new Button("Button6");
		gridbag.setConstraints(b6, constraint);
		add(b6);

		Button b7 = new Button("Button7");
		gridbag.setConstraints(b7, constraint);
		add(b7);
		
		pack();
		setVisible(true);
	}
}