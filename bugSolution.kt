fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = list.filter { it > 2 } 
    list.removeAll(toRemove)
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemoveSet = set.filter { it > 2 }
    set.removeAll(toRemoveSet)
    println(set) // Output: [1, 2]
    
    //Alternative solution using iterator
    val list2 = mutableListOf(1,2,3,4,5)
    val iterator = list2.iterator()
    while(iterator.hasNext()){
        if(iterator.next() > 2){
            iterator.remove()
        }
    }
    println(list2) // Output: [1,2]
} 