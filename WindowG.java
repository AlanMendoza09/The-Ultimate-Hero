import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class WindowG extends JFrame{

	private JPanel firstpanel;/*todo va en pantalla de inicio*/
	private JLabel presentlabel, gamelabel;
	private JButton start;

	private JPanel historypanel, mappanel, buttonpanel, stpanel, mapCpanel;/*pantalla principal*/
	private JLabel xplabel, levellabel, attacklabel, defenselabel;
	private JButton arrUp,arrDown, arrRight, arrLeft, stock;
	private Hero hero;
	private Map map;

	private JLabel namelabel, levell, attackl, defensel, explabel;

	public WindowG(){
		super("RPG");
		map= new Map(20,20);
		hero= new Hero(100, 150, "Juan Jo", 1, 3, 1, 1, 5, 5);
		createMap();
		initComponentsStart();
		setLayout(new GridLayout(2,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1500,850);
		setVisible(true);
	}

	public void initComponentsStart(){
		firstpanel=new JPanel();
		firstpanel.setLayout(new GridLayout(2,2));
		presentlabel=new JLabel("Welcome");
		firstpanel.add(presentlabel);

		gamelabel=new JLabel("The Ultimate Hero");
		firstpanel.add(gamelabel);

		start=new JButton("Inicio");
		start.addActionListener(new StartButtonListener());
		firstpanel.add(start);

		add(firstpanel);
	}
	public void createMap(){
		for(int i=0;i<map.getBoxes().length;i++){
			for(int j=0;j<map.getBoxes()[i].length;j++){
				map.getBoxes()[i][j]= new Box();
			}
		}
		map.getBoxes()[5][5].setHero(hero);
	}
	public void initComponentsPantallaPrincipal(){
		mapCpanel= new JPanel();
		mapCpanel.setLayout(new FlowLayout());
		add(mapCpanel);
		paintMap();
		historypanel= new JPanel();
		add(historypanel);
		buttonpanel=new JPanel();
		buttonpanel.setLayout(new GridLayout(3,3));
		arrUp= new JButton("Up");
		arrUp.addActionListener(new ArrUpButtonListener());
		buttonpanel.add(new JLabel(""));
		buttonpanel.add(arrUp);
		buttonpanel.add(new JLabel(""));
		arrDown=new JButton("arrDown");
		arrDown.addActionListener(new ArrDownButtonListener());
		buttonpanel.add(arrDown);
		stock=new JButton("Stock");
		stock.addActionListener(new StockButtonListener());
		buttonpanel.add(stock);
		arrRight= new JButton("Right");
		arrRight.addActionListener(new ArrRightButtonListener());
		buttonpanel.add(arrRight);
		arrLeft=new JButton("Left");
		arrLeft.addActionListener(new ArrLeftButtonListener());
		buttonpanel.add(new JLabel(""));
		buttonpanel.add(arrLeft);
		buttonpanel.add(new JLabel(""));

		
		add(buttonpanel);

		namelabel= new JLabel();
		levell=new Jlabel();
		attackl= new JLabel();
		defensel= new JLabel();
		explabel= new JLabel();

		stpanel=new JPanel();
		stpanel.setLayout(new GridLayout(7,5));
		
		stpanel.add(new JLabel(""));
		stpanel.add(new JLabel(""));
		namelabel.setText(hero.getName());
		stpanel.add(namelabel);
		stpanel.add(new JLabel(""));
		stpanel.add(new JLabel(""));

		levell=new JLabel("Level ");
		stpanel.add(new JLabel(""));
		stpanel.add(levell);
		stpanel.add(new JLabel(""));
		String levelint = String.valueOf(hero.getLevel());
		levell.setText(levelint);
		stpanel.add(levell);
		stpanel.add(new JLabel(""));

		attackl=new JLabel("Attack ");
		stpanel.add(new JLabel(""));
		stpanel.add(attackl);
		stpanel.add(new JLabel(""));
		String attackint = String.valueOf(hero.getAttack());
		attackl.setText(attackint);
		stpanel.add(attackl);
		stpanel.add(new JLabel(""));

		defensel=new JLabel("Defense ");
		stpanel.add(new JLabel(""));
		stpanel.add(defensel);
		stpanel.add(new JLabel(""));
		String defenseint = String.valueOf(hero.getDefense());
		defensel.setText(defenseint);
		stpanel.add(defensel);
		stpanel.add(new JLabel(""));

		explabel=new JLabel("Exp ");
		stpanel.add(new JLabel(""));
		stpanel.add(explabel);
		stpanel.add(new JLabel(""));
		String expint = String.valueOf(hero.getExp());
		explabel.setText(expint);
		stpanel.add(explabel);
		stpanel.add(new JLabel(""));

		add(stpanel);
	}
	public void paintMap(){
		mappanel= new JPanel();
		mappanel.setLayout(new GridLayout(map.boxes.length,map.boxes[0].length));
		for(int i=0;i<map.boxes.length;i++){
			for(int j=0;j<map.boxes[i].length;j++){
				if(map.boxes[i][j].hero==null){
					mappanel.add(new JLabel("Empty"));
				}else{
					mappanel.add(new JLabel("Hero"));
				}
			}
		}
		
		mapCpanel.add(mappanel);
		mapCpanel.revalidate();
		mapCpanel.repaint();		
	}
	public class ArrUpButtonListener implements ActionListener{
		
	}


	public WindowG(){

		setSize(1500,850);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){

	}

	public static void main(String[] args) {
		new WindowG();
	}
}