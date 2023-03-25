public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume(){
        return  width * length * height;
    }

    public int getSurfaceArea(){
        return  2 * (width * length + width * height + length * height);
    }
}
