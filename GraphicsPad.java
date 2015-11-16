public class GraphicsPad{

    protected String country;
    protected String model;
    protected String control;
    protected int iface;
    protected int workArea = 0;
    protected int resolution = 0;
    protected int year = 0;
    protected int size = 0;
    protected int weight = 0;
    protected int warranty = 0;

    protected void setCountry(String country){
        this.country = country;
    }

    protected void setModel(String model){
        this.model = model;
    };

    protected void setControl(String control){
        this.control = control;
    };

    protected int getInterface(){
        return this.iface;
    };

    protected void setWorkArea(int workArea){
        this.workArea = workArea;
    };

    protected void setResolution(int resolution){
        this.resolution = resolution;
    };

    protected void setYear(int year){
        this.year = year;
    };

    protected void setSize(int size){
        this.size = size;
    };

    protected void setWeight(int weight){
        this.weight = weight;
    };

    protected void setWarranty(int warranty){
        this.warranty = warranty;
    };

    @Override
    public boolean equals(Object obj){
        if (this == obj){return true;}
        if (obj == null || getClass() != obj.getClass()){return false;}
        GraphicsPad that = (GraphicsPad) obj;

        if (that.country != country ) return false;
        if (that.model != model ) return false;
        if (that.control != control ) return false;
        if (that.iface != iface ) return false;
        if (that.workArea != workArea ) return false;
        if (that.resolution != resolution ) return false;
        if (that.year != year ) return false;
        if (that.size != size ) return false;
        if (that.weight != weight ) return false;
        if (that.warranty != warranty ) return false;

        return true;
        }

    @Override
    public int hashCode(){
        final int prime = 271;
        int result = 1;
        //result = prime * result + control;
        //result = prime * result + country;
        result = prime * result + size;
        result = prime * result + weight;
        result = prime * result + warranty;
        result = prime * result + workArea;
        result = prime * result + resolution;
        result = prime * result + year;
        //result = prime * result + model;
        result = prime * result + iface;
        return result;
    }

    public static void main(String[] args) {
      GraphicsPad gp = new GraphicsPad();
        
        //return true;
    }


}