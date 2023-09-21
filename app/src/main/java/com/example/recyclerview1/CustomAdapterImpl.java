package com.example.recyclerview1;

public class CustomAdapterImpl extends CustomAdapter.CustomAdapter {
    /**
     * Initialize the dataset of the Adapter
     *
     * @param dataSet String[] containing the data to populate views to be used
     *                by RecyclerView
     */
    public CustomAdapterImpl(Contact[] dataSet) {
        super(dataSet);
    }
}
