package com.casestudy.springboot.service;

import com.casestudy.springboot.Error.WasherNotFoundException;
import com.casestudy.springboot.entity.Washer;

import java.util.List;

public interface WasherService {
    public Washer saveWasher(Washer washer);

    public List<Washer> fetchWasherList();

    public Washer fetchWasherById(Long washerId) throws WasherNotFoundException;

    public void deleteWasherById(Long washerId);

    public Washer updateWasher(Long washerId, Washer washer);

    public Washer fetchWasherByName(String washerName);
}
