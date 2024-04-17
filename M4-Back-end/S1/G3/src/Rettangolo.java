public class Rettangolo {

        private float altezza;
        private float larghezza;

        public Rettangolo(float x ,float y){

             this.larghezza = x;

             this.altezza = y;

        }

        public float getPerimetro(){

            float perimetro = (altezza+larghezza)*2;

            return perimetro;
        }

        public float getArea(){

            float area = altezza*larghezza;

            return area;

        }

        public void stampaRettangoli(Rettangolo x){

            System.out.println("Questo è il perimetro del rettangolo:"+x.getPerimetro());
            System.out.println("Questa è l'area del rettangolo:"+x.getArea());
        }

        public void stampaDueRettangoli(Rettangolo x, Rettangolo y){

            System.out.println("La somma dell'area dei rettangoli è:"+ (x.getArea()+y.getArea()));
            System.out.println("La somma deli perimetri dei rettangoli è:"+ (x.getPerimetro()+y.getPerimetro()));
        }


}
