class WorkoutNode { // start class WorkoutNode
   private WorkoutNode prev;
   private Workouts data;
   private WorkoutNode next;
   
   public WorkoutNode(Workouts data){ // start constructor WorkoutNode
     this.data = data;
     this.next = null;
     this.prev = null;
   } // end constructor WorkoutNode
  
   public WorkoutNode getPrev() { // start method getPrev
      return this.prev;
   } // end method getPrev
  
   public void setPrev(WorkoutNode prevNode) { // start method setPrev
      this.prev = prevNode;
   } // end method setPrev
  
   public WorkoutNode getNext(){ // start method getNext
      return this.next;
   } // end method getNext
  
   public void setNext(WorkoutNode nextNode){ // start method setNext
      this.next = nextNode;
   } // end method setNext
   
   public void printNodeData(int day){ // start method printNodeData
      this.data.printWorkoutDay(day);
   } // end method printNodeData
} // end class WorkoutNode