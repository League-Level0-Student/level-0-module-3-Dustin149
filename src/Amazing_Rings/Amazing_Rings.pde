void CreateEllipse(float LocationX,float LocationY){
  for (int i=1;i<30;i++) {
    noFill();
    ellipse(LocationX,LocationY,10*i,10*i);
  }
}

void setup(){
  size(1000,500);
}

 int Status = 1;
 float MinX = 250;
 float MaxX = 750;
 float CurrentX1 = 250;
 float CurrentX2 = 750;
 float Speed = 5;
  
void draw() {
  fill(255,255,255);
  rect(0,0,10000,10000);
  noFill();
  
  println(CurrentX1);
  
  if (Status == 1){
    CreateEllipse(CurrentX1+(1*Speed),250);
    CreateEllipse(CurrentX2-(1*Speed),250);
    
    CurrentX1 = CurrentX1 + (1*Speed);
    CurrentX2 = CurrentX2 - (1*Speed);
    
    if (CurrentX1>=750) {
      Status = 2;
    }
  }else if(Status==2) {
     CreateEllipse(CurrentX1-(1*Speed),250);
    CreateEllipse(CurrentX2+(1*Speed),250);
    
    CurrentX1 = CurrentX1 - (1*Speed);
    CurrentX2 = CurrentX2 + (1*Speed);
    
    if (CurrentX1<=250) {
      Status = 1;
    }   
  }
  
  
  
}