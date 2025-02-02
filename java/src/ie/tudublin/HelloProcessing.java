package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		//colorMode(HSB);
		background(0);

		x1 = random(0, width);
		x2 = random(0, width);
		y1 = random(0, height);
		y2 = random(0, height);

		float range = 5;

		x1dir = random(-range, range);
		x2dir = random(-range, range);
		y1dir = random(-range, range);
		y2dir = random(-range, range);

		smooth();
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		stroke(255);
		line(10,10,100,100); //x1 y1 x2 y2
		circle(300,250,70); //cx yx
		fill(0,255,0);
		rect(10, 300, 20, 100); //top left x top left y, width, height
		stroke(127);
		fill(0,0,255);
		noStroke();
		noFill();
		strokeWeight(1);
		triangle(40,90,300,20,80,70);
		fill(0,0,255);
	}
}
