package com.example.listsandforms.utils;

import com.example.listsandforms.models.Something;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ListCreator {
  private ArrayList<Something> list = new ArrayList<>();

  public ArrayList<Something> getList() {
    list.add(new Something(1, "You are the sunshine of my life.", 3.14));
    list.add(new Something(2, "In your eyes, I see my future.", 2.71));
    list.add(new Something(3, "Your smile brightens up my day.", 1.618));
    list.add(new Something(4, "With you, every moment is magical.", 0.618));
    list.add(new Something(5, "Your love is my greatest treasure.", 1.732));
    list.add(new Something(6, "Being with you feels like home.", 2.236));
    list.add(new Something(7, "You make my heart skip a beat.", 1.414));
    list.add(new Something(8, "Your laughter is music to my ears.", 2.236));
    list.add(new Something(9, "I cherish every second with you.", 3.162));
    list.add(new Something(10, "You are my everything.", 0.577));
    list.add(new Something(11, "I am grateful for your love.", 1.732));
    list.add(new Something(12, "You complete me in every way.", 0.577));
    list.add(new Something(13, "I am blessed to have you in my life.", 2.449));
    list.add(new Something(14, "Your love is the greatest gift.", 1.732));
    list.add(new Something(15, "I fall for you more every day.", 0.866));
    list.add(new Something(16, "You are my happily ever after.", 3.162));
    list.add(new Something(17, "With you, I am at peace.", 2.449));
    list.add(new Something(18, "Your love fills me with joy.", 1.732));
    list.add(new Something(19, "You are the one I've been waiting for.", 1.618));
    list.add(new Something(20, "I love you more than words can say.", 2.236));

    return list;
  }
}
