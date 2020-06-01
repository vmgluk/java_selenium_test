package test.ship;
/*Created by VMgluk 06 2020*/

public class StarShip {
    /*высота*/
    public double shipHeight;

    //добавить конструктор для корабля
    public StarShip (double shipHeight) { this.shipHeight=shipHeight;}

       //возвращает высоту корабля
        public double getShipHeight (){
            return this.shipHeight;
        }

}
