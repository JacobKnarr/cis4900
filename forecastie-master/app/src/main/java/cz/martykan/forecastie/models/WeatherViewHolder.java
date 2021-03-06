package cz.martykan.forecastie.models;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import cz.martykan.forecastie.R;

public class WeatherViewHolder extends RecyclerView.ViewHolder {
    public TextView itemDate;
    public TextView itemTemperature;
    public TextView itemDescription;
    public TextView itemyWind;
    public TextView itemPressure;
    public TextView itemHumidity;
    public TextView itemIcon;


    public WeatherViewHolder(View view) {
        super(view);
        this.itemDate = view.findViewById(R.id.itemDate);
        this.itemTemperature = view.findViewById(R.id.itemTemperature);
        this.itemDescription = view.findViewById(R.id.itemDescription);
        this.itemyWind = view.findViewById(R.id.itemWind);
        this.itemPressure = view.findViewById(R.id.itemPressure);
        this.itemHumidity = view.findViewById(R.id.itemHumidity);
        this.itemIcon = view.findViewById(R.id.itemIcon);
        view.findViewById(R.id.lineView);
    }
}