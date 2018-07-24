void CreateEllipse(int LocationX,int LocationY){
  for (int i=1;i<30;i++) {
    noFill();
    ellipse(LocationX,LocationY,10*i,10*i);
  }
}

void setup(){
  size(1000,500);
}

void draw() {
  int Status = 1;
  
  int MinX = 250;
  int MaxX = 750;
  int CurrentX1 = 250;
  int CurrentX2 = 750;
  
  if (Status == 1){
    CreateEllipse(CurrentX1+1,250);
    CreateEllipse(CurrentX2-1,250);
    
    CurrentX1 = CurrentX1 + 1;
    CurrentX2 = CurrentX2 - 1;
    
    if (CurrentX1>=750) {
      Status = 2;
    }
  }else if(Status==2) {
     CreateEllipse(CurrentX1-1,250);
    CreateEllipse(CurrentX2+1,250);
    
    CurrentX1 = CurrentX1 - 1;
    CurrentX2 = CurrentX2 + 1;
    
    if (CurrentX1<=250) {
      Status = 1;
    }   
  }
  
  
  
}