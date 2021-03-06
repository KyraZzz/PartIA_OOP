package supervision1.question14;

public class Vector2D {
    private float[] elements;
    private int height;

    private Vector2D(int height){
        this.elements = new float[height];
        this.height = height;
    }

    Vector2D(float[] elements){
        this.elements = elements;
        this.height = elements.length;
    }

    // Mutable add
    public void add(Vector2D other){
        if (this.height!=other.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        for (int i=0;i<this.height;i++){
            this.elements[i] = this.elements[i] + other.elements[i];
        }
    }

    // immutable add
    public Vector2D add2(Vector2D other){
        if (this.height!=other.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        Vector2D res = new Vector2D(this.height);
        for (int i=0;i<this.height;i++){
            res.elements[i] = this.elements[i] + other.elements[i];
        }
        return res;
    }

    public Vector2D add3(Vector2D v1, Vector2D v2){
        if (v1.height!=v2.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        Vector2D res = new Vector2D(v1.height);
        for (int i=0;i<v1.height;i++){
            res.elements[i] = v1.elements[i] + v2.elements[i];
        }
        return res;
    }

    public static Vector2D add(Vector2D v1, Vector2D v2){
        if (v1.height!=v2.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        Vector2D res = new Vector2D(v1.height);
        for (int i=0;i<v1.height;i++){
            res.elements[i] = v1.elements[i] + v2.elements[i];
        }
        return res;
    }

    float scalarProduct(Vector2D other){
        if (this.height!=other.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        float res = 0f;
        for (int i=0;i<this.height;i++){
            res += this.elements[i] * other.elements[i];
        }
        return res;
    }

    float magnitude(){
        return (float) Math.sqrt(this.scalarProduct(this));
    }

    void normalisation(){
        float magnitude = magnitude();
        for (int i=0;i<height;i++){
            this.elements[i] = this.elements[i]/magnitude;
        }
    }

}
