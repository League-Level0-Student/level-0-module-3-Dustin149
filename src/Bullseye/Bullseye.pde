void setup() {
  size(500,500);
  for (int i=10;i>1;i--) {
    if (i%2==0){
     fill(255,255,255);
    }else{
      fill(255,20,20);
    }
    ellipse(250,250,15*i,15*i);
  }
}