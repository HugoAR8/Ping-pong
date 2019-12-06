package ping;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
	//depois testar trocar o double por int 
	public double x,y;
	public int width, height;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}
	
	public void tick() {
		x+= (Game.ball.x - x - 6) * 0.1;

	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x,(int)y,width, height);
		
		
	}
	

}
