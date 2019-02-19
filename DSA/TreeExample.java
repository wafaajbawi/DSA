public class TreeExample {

       pu
    lic static void main(String[] args) {
        NodeTree<String> root = createTree();
        printTree(root, " ");
  

       private static NodeTree<String> createTree() {
        NodeTree<String> root = new NodeTree<>("root");

        NodeTree<String> node1 = root.addChild(new NodeTree<String>("node 1"));

        NodeTree<String> node11 = node1.addChild(new NodeTree<String>("node 11"));
        NodeTree<String> node111 = node11.addChild(new NodeTree<String>("node 111"));
        NodeTree<String> node112 = node11.addChild(new NodeTree<String>("node 112"));

        NodeTree<String> node12 = node1.addChild(new NodeTree<String>("node 12"));

        NodeTree<String> node2 = root.addChild(new NodeTree<String>("node 2"));

        NodeTree<String> node21 = node2.addChild(new NodeTree<String>("node 21"));
        NodeTree<String> node211 = node2.addChild(new NodeTree<String>("node 22"));
        return root;
    }


          System.out.println(appender + node.getData());
        node.getChildren().forEach(each -> printTree(each, appender + appender));
    }

    
         
    



    
        
        
    

    
        

        

        
        
        

        

        

        
        
        
    

    
        
         
    