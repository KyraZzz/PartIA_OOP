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

    Vector2D addition(Vector2D other){
        if (this.height!=other.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        Vector2D res = new Vector2D(height);
        for (int i=0;i<this.height;i++){
            res.elements[i] = this.elements[i] + other.elements[i];
        }
        return other;
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
