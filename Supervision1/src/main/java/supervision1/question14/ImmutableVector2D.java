package supervision1.question14;

public class ImmutableVector2D {
    private final float[] elements;
    private final int height;

    private ImmutableVector2D(int height){
        this.elements = new float[height];
        this.height = height;
    }

    ImmutableVector2D(float[] elements){
        this.elements = elements;
        this.height = elements.length;
    }

    // Mutable add is not supported in the ImmutableVector2D
    /*
    public void add(ImmutableVector2D other){
        if (this.height!=other.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        for (int i=0;i<this.height;i++){
            this.elements[i] = this.elements[i] + other.elements[i];
        }
    }
     */

    // immutable add
    public ImmutableVector2D add2(ImmutableVector2D other){
        if (this.height!=other.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        ImmutableVector2D res = new ImmutableVector2D(this.height);
        for (int i=0;i<this.height;i++){
            res.elements[i] = this.elements[i] + other.elements[i];
        }
        return res;
    }

    public ImmutableVector2D add3(ImmutableVector2D v1, ImmutableVector2D v2){
        if (v1.height!=v2.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        ImmutableVector2D res = new ImmutableVector2D(v1.height);
        for (int i=0;i<v1.height;i++){
            res.elements[i] = v1.elements[i] + v2.elements[i];
        }
        return res;
    }

    public static ImmutableVector2D add(ImmutableVector2D v1, ImmutableVector2D v2){
        if (v1.height!=v2.height){
            throw new UnsupportedOperationException("Addition can not be performed on two vectors which have different size.");
        }
        ImmutableVector2D res = new ImmutableVector2D(v1.height);
        for (int i=0;i<v1.height;i++){
            res.elements[i] = v1.elements[i] + v2.elements[i];
        }
        return res;
    }

    float scalarProduct(ImmutableVector2D other){
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
