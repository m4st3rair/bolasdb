
package bolasdb;




public class Producto {
    private String  desc;   //descripcion del producto
    private int codigoProd; //[9999]
    private int existencia; //numero de productos en existencia
    private double precioMayoreo, precioMenudeo;
    private int numeroMinimoMayoreo;
    private String dirFoto;//Direccion de la foto
    
    
    public Producto(double precioMayoreo,double precioMenudeo, String desc, int numeroMinimoMayoreo,String dirFoto){
        this.precioMayoreo= precioMayoreo;
        this.precioMenudeo= precioMenudeo;
        this.desc= desc;
        this.numeroMinimoMayoreo= numeroMinimoMayoreo;
        if (dirFoto.equals("")) {
            this.dirFoto="SinFoto";
        }else{
            this.dirFoto= dirFoto;        
        }
         
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(int codigoProd) {
        this.codigoProd = codigoProd;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecioMayoreo() {
        return precioMayoreo;
    }

    public void setPrecioMayoreo(double precioMayoreo) {
        this.precioMayoreo = precioMayoreo;
    }

    public double getPrecioMenudeo() {
        return precioMenudeo;
    }

    public void setPrecioMenudeo(double precioMenudeo) {
        this.precioMenudeo = precioMenudeo;
    }

    public int getNumeroMinimoMayoreo() {
        return numeroMinimoMayoreo;
    }

    public void setNumeroMinimoMayoreo(int numeroMinimoMayoreo) {
        this.numeroMinimoMayoreo = numeroMinimoMayoreo;
    }

    public String getDirFoto() {
        return dirFoto;
    }

    public void setDirFoto(String dirFoto) {
        this.dirFoto = dirFoto;
    }

    

}
