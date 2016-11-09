Problem
=======

Workaround for type casting to Parameterized Generic Types


When compiling I get the following error:

    [ERROR] /Users/jklo/projects/scratchpad/src/main/java/com/sri/jklo/vm/MultiItemStemViewModel.java:[80,17] incompatible types: com.sri.jklo.interfaces.IItemViewModel<java.lang.String,com.sri.jklo.interfaces.IPersistent> cannot be converted to com.sri.jklo.vm.ItemViewModel
    [ERROR] /Users/jklo/projects/scratchpad/src/main/java/com/sri/jklo/vm/MultiItemStemViewModel.java:[81,39] incompatible types: com.sri.jklo.interfaces.IItemViewModel<java.lang.String,com.sri.jklo.interfaces.IPersistent> cannot be converted to com.sri.jklo.vm.ItemViewModel
    [INFO] 2 errors 
    
Basically due to this block of code:

        public ItemViewModel getSubItem() {
            ItemViewModel ret;
            if (this.item instanceof ItemViewModel) {
                ret =  (ItemViewModel)this.item;
            } else {
                ret = null;
            }
            return ret;
        }
        
I'm not sure what the workaround to this would be.