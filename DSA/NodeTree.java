import java.util.ArrayList;
import java.util.List;

public class NodeTree<T> {

    private T data = null;

    private List<NodeTree<T>> children = new ArrayList<>();

    private NodeTree<T> parent = null;

    public NodeTree(T data) {
        this.data = data;
    }

    public NodeTree getRoot() {
        if (parent == null) {
            return this;
        }
        return this;
    }

    public NodeTree<T> addChild(NodeTree<T> child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public void addChildren(List<NodeTree<T>> children) {
        for (NodeTree t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);

    }

    public List<NodeTree<T>> getChildren() {
        return this.children;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(NodeTree<T> parent) {

        this.parent = parent;
    }

    public NodeTree<T> getParent() {
        return this.parent;
    }

}