public class BinaryTree<E>{
    E spanishValue;
    E englishValue;
    BinaryTree<E> left;
    BinaryTree<E> right;

    public BinaryTree(E englishValue,E spanishValue){
        this.spanishValue=spanishValue;
        this.englishValue=englishValue;
    }

    public BinaryTree(E englishValue,E spanishValue,BinaryTree<E> left, BinaryTree<E> right){
        this.spanishValue=spanishValue;
        this.englishValue=englishValue;
        this.left=left;
        this.right=right;
    }

    E englishValue(){
        return this.englishValue;
    }

    E spanishValue(){
        return this.spanishValue;
    }

    BinaryTree<E> getLeft(){
        return this.left;
    }

    BinaryTree<E> getRight(){
        return this.right;
    }

    
    void setLeft(BinaryTree<E> newLeft){
        left=newLeft;
    }

    void setRight(BinaryTree<E> newRight){
        right=newRight;
    }


}