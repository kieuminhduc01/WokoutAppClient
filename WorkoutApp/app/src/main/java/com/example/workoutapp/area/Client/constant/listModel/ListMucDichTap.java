package com.example.workoutapp.area.Client.constant.listModel;

import com.example.workoutapp.area.Client.constant.model.MucDichTap;

import java.util.ArrayList;
import java.util.List;

public class ListMucDichTap {
    public static List<String> getAll(){
        List<String> mucDichTaps=new ArrayList<>();
        mucDichTaps.add(MucDichTap.GainMuscle);
        mucDichTaps.add(MucDichTap.LoseFat);
        mucDichTaps.add(MucDichTap.StrengthTraining);
        return mucDichTaps;
    }
}
