package punto;


    /** Esta clase representa un punto en 4 dimensiones
     * @author amvelasquez
     */
    public class P4 extends P3{
        //Atributos
        private int w;

        /**
         * Crea un objeto de tipo P4
         */
        public P4(){
            super();
            this.w = 0;
        }

        /**
         * Crea un objeto de tipo P4
         * @param x Coordenada X
         * @param y Coordenada Y
         * @param z Coordenada Z
         * @param w Coordenada W
         */
        public P4(int x, int y, int z, int w){
            super(x,y,z,w);
            this.w = w;
        }

        /**
         * Crea un objeto de tipo P4
         * @param p3 Objeto tipo P3
         * @param w Coordenada W
         */
        public P4(P3 p3, int w){
            super(p3);
            this.w = w;
        }

        /**
         * Crea un objeto de tipo P4
         * @param p4 un objeto de 4 coodenadas
         */
        public P4(punto.P4 p4){
            this(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
        }
        /**
         * Retorna coordenada w
         * @return Coordenada w
         */
        public int getW(){
            return this.w;
        }

        /**
         * Asigna un valor a la coordenada W
         * @param w
         */
        public void setW(int w){
            this.w = w;
        }

        /**
         * Calcula la distancia entre dos puntos en 4 dimensiones
         * @param x coordenada X del otro punto
         * @param y coordenada Y del otro punto
         * @param z coodenada Z del otro punto
         * @param w coordenada W del otro punto
         * @return distancia
         */
        public double calcularDistancia(int x, int y, int z, int w){
            double distancia;
            double diferenciaCuadradosX = Math.pow(getX() - x, 2);
            double diferenciaCuadradosY = Math.pow(getY() - y, 2);
            double diferenciaCuadradosZ = Math.pow(getZ() -z, 2);
            double diferenciaCuadradosW = Math.pow(this.w - w,2);

            distancia = Math.sqrt(diferenciaCuadradosX + diferenciaCuadradosY
                    +diferenciaCuadradosZ + diferenciaCuadradosW);

            return distancia;
        }

        /**
         * Calcula la distancia entre dos puntos en tres dimensiones
         * @param p2 objeto de tipo P2
         * @param w coordenada W
         * @return distancia
         */
        public double calcularDistancia(P2 p2, int w){
            return calcularDistancia(p2.getX(), p2.getY(), w);
        }

        /**
         * Calcula la distancia entre dos puntos en tres dimensiones
         * @param p4 objeto de tipo P4
         * @param w distancia
         * @return
         */
        public double calcularDistancia(punto.P4 p4){
            return  calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
        }

        public String toString(){
            return super.toString()+ "W: "+this.w;
        }
    }
