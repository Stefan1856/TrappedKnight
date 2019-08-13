public class TrappedKnight{
  public static void main(String args[]){
    int n  =2;   int m  = 1;
    int sx = 0;   int sy = 0;
    int [] pos = {sx,sy,Feld.wert(sx,sy)};                  //Startposition
    int[] Besucht = {Feld.wert(sx,sy)};


      StdDraw.setCanvasSize((int)(Math.sqrt(2)*1000),1000); //Bild einrichten
      StdDraw.setXscale(-30,30+(Math.sqrt(2)*60-60));
      StdDraw.setYscale(-30,30);
      T.Koordinatensystem();
      StdDraw.setPenColor(StdDraw.BLACK);
      T.T("Startwert  ",sx,sy,31,27);                             //gebe Startwert an
      T.T("Bewegung",n,m,31,26);                                   //gebe Bewegung an
      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.filledCircle(sx,sy,0.3);                      //markiere Startpunkt
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.textLeft(31,25,"Schritte    :");
      StdDraw.textLeft(31,24,"Endwert   :");
    int i = 1;
    while(i<3000){
//T.A(Besucht);
//T.L();
      // int[][] möglpos={{pos[0]+pos[0],pos[1]+pos[1],Feld.wert(pos[0]+pos[0],pos[1]+pos[1])},  //mögliche nächste Positionen
      //                  {pos[0]+pos[0],pos[1]-pos[1],Feld.wert(pos[0]+pos[0],pos[1]-pos[1])},
      //                  {pos[0]-pos[0],pos[1]+pos[1],Feld.wert(pos[0]-pos[0],pos[1]+pos[1])},
      //                  {pos[0]-pos[0],pos[1]-pos[1],Feld.wert(pos[0]-pos[0],pos[1]-pos[1])},
      //                  {pos[0]+pos[1],pos[1]+pos[0],Feld.wert(pos[0]+pos[1],pos[1]+pos[0])},
      //                  {pos[0]+pos[1],pos[1]-pos[0],Feld.wert(pos[0]+pos[1],pos[1]-pos[0])},
      //                  {pos[0]-pos[1],pos[1]+pos[0],Feld.wert(pos[0]-pos[1],pos[1]+pos[0])},
      //                  {pos[0]-pos[1],pos[1]-pos[0],Feld.wert(pos[0]-pos[1],pos[1]-pos[0])}
      //                 };
        int[][] möglpos={{pos[0]+n,pos[1]+m,Feld.wert(pos[0]+n,pos[1]+m)},  //mögliche nächste Positionen
                         {pos[0]+n,pos[1]-m,Feld.wert(pos[0]+n,pos[1]-m)},
                         {pos[0]-n,pos[1]+m,Feld.wert(pos[0]-n,pos[1]+m)},
                         {pos[0]-n,pos[1]-m,Feld.wert(pos[0]-n,pos[1]-m)},
                         {pos[0]+m,pos[1]+n,Feld.wert(pos[0]+m,pos[1]+n)},
                         {pos[0]+m,pos[1]-n,Feld.wert(pos[0]+m,pos[1]-n)},
                         {pos[0]-m,pos[1]+n,Feld.wert(pos[0]-m,pos[1]+n)},
                         {pos[0]-m,pos[1]-n,Feld.wert(pos[0]-m,pos[1]-n)}
                        };

      int[][] sortpos = Sort.wert(möglpos);   //möglpos sortiert nach Feldwert
//T.A(sortpos);
//T.L();
      int[] nextpos = {0,0,0};

      for(int j=0;j<sortpos.length+1;j++){                     //gucke nach ob das kleinste mögliche Feld bereits besucht wurde
        if(j == sortpos.length){
          StdDraw.setPenColor(StdDraw.RED);
          StdDraw.filledCircle(pos[0],pos[1],0.3);
          i=3000;
        }
        if(Wert.inArr(sortpos[j][2],Besucht)){

        }
        else{
          for(int u=0;u<3;u++){
            nextpos[u]=sortpos[j][u];          //das kleinste mögliche unbesuchte Feld wird das nächste Feld
          }
          if(nextpos[0]<30 && pos[0]<30){
            StdDraw.line(pos[0], pos[1], nextpos[0], nextpos[1]);  //zeichne Linie von dem aktuellen Feld zum Nächsten
          }
          Besucht = Wert.add(nextpos[2],Besucht);                //markiere das Feld als besucht
          for(int v=0;v<3;v++){                                  //setze das nächste Feld als das Aktuelle
            pos[v]=nextpos[v];
          }
          i++;
          StdDraw.setPenColor(StdDraw.WHITE);
          StdDraw.filledrect(38.2,24.9,1,2);
          StdDraw.setPenColor(StdDraw.BLACK);
          String I = String.valueOf(i);
          String J = String.valueOf(pos[2]);
          StdDraw.textLeft(36.6,25,I);
          StdDraw.textLeft(36.6,24,J);
//System.out.print(pos[2]+",");
//T.L();//T.L();
          break;
        }
      }
    }
  }
}
