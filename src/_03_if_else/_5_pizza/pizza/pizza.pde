
void setup() {
    size(1000, 1000);

}
void draw() {
    fill(#D2B48C);
    ellipse(500, 500, 1000, 1000);
    fill(#b21807);
    ellipse(500, 510, 915, 950);
    fill(#ffa600);
    ellipse(500, 510, 900, 940);
    PImage pepperoni;
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(200, 200);
    PImage mushroom;
    mushroom = loadImage("mushroom.png");
    
    PImage olive;
    olive = loadImage("olive.png");
    olive.resize(300, 300);
    if(mousePressed){
  image(pepperoni, 200, 200);
  image(pepperoni, 500, 500);
  image(pepperoni, 550, 620);
  image(pepperoni, 210, 283);
  image(pepperoni, 300, 568);
  image(pepperoni, 595, 278);
  image(mushroom, 289, 185);
image(mushroom, 582, 763);
image(mushroom, 700, 500);
image(olive, 50, 450);
    }
}
