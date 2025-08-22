class DemographicNode { // start class DemographicNode
   private DemographicNode prev;
   private DemographicInfo data;
   private DemographicNode next;
   
   public DemographicNode(DemographicInfo data){ // start constructor DemographicNode
     this.data = data;
     this.next = null;
     this.prev = null;
   } // end constructor DemographicNode
  
   public DemographicNode getPrev() { // start method getPrev
      return this.prev;
   } // end method getPrev
  
   public void setPrev(DemographicNode prevNode) { // start method setPrev
      this.prev = prevNode;
   } // end method setPrev
  
   public DemographicNode getNext(){ // start method getNext
      return this.next;
   } // end method getNext
  
   public void setNext(DemographicNode nextNode){ // start method setNext
      this.next = nextNode;
   } // end method setNext
   
   public void printNodeData(){ // start method printNodeData
      this.data.printInfoShort();
   } // end method printNodeData
} // end class DemographicNode