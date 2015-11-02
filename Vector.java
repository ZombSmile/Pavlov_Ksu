public class Vector {

    int x = 0;
    int y = 0;
    int z = 0;
    int sp = 0; //variable scalar product
    double result = 0.0;

    double getModule (int x, int y, int z){     //calculation of the module/length of a vector
        this.x += x;
        this.y += y;
        this.z += z;
        return result = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    void getSumModule (Vector vector){         //addition of vectors
        this.x += vector.x;
        this.y += vector.y;
        this.z += vector.z;
        System.out.println(" Vector coordinates: x = " + x + ", y = " + y +  ", z = " + z);
    }

    void getSubtractModule (Vector vector){    //subtraction of vectors
        this.x -= vector.x;
        this.y -= vector.y;
        this.z -= vector.z;
        System.out.println(" Vector coordinates: x = " + x + ", y = " + y +  ", z = " + z);
    }

    void getMultipModule (Vector vector, Vector vectorS){  //multiplication of vectors
        vector.x *= vectorS.x;
        vector.y *= vectorS.y;
        vector.z *= vectorS.z;
        System.out.println(" Vector coordinates: x = " + vector.x + ", y = " + vector.y +  ", z = " + vector.z);
    }

    int getScalarProduct(Vector vector, Vector vectorS){   //scalar product
        return sp = ((vectorS.x * vector.x) + (vectorS.y * vector.y) + (vectorS.z * vector.z));
    }

    void printModule(){
        System.out.println(this.result);
    }

        void printModuleSp(){
        System.out.println(this.sp);
    }


    public static void main(String[] args) {
        Vector vector1 = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        Vector vector4 = new Vector();
        vector3.getModule(1, 1, 1);
        
        vector4.getModule(1, 1, 1);
        
        vector1.getModule(8, 7, 6);
        
        vector1.printModule();

        vector2.getModule(-9, -8, -7);
        
        vector2.printModule();


        vector3.getScalarProduct(vector1, vector2);
        
        vector3.printModuleSp();
        
        vector4.getMultipModule(vector1, vector2);

        vector1.getSumModule(vector2);

        vector2.getSubtractModule(vector1);




        

    }
}