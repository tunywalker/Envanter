
package Entity;


public class Model {
    private int id;
    private int marka_id;
    private String model_adi;

    public Model() {
    }

    public Model(int id, int marka_id, String model_adi) {
        this.id = id;
        this.marka_id = marka_id;
        this.model_adi = model_adi;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarka_id() {
        return marka_id;
    }

    public void setMarka_id(int marka_id) {
        this.marka_id = marka_id;
    }

    public String getModel_adi() {
        return model_adi;
    }

    public void setModel_adi(String model_adi) {
        this.model_adi = model_adi;
    }

    @Override
    public String toString() {
        return "Model{" + "id=" + id + ", marka_id=" + marka_id + ", model_adi=" + model_adi + '}';
    }
    
    
}
