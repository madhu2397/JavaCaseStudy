//package com.casestudy.springboot.service;
//
//import com.casestudy.springboot.entity.Washer;
//import com.casestudy.springboot.repository.WasherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Objects;
//
//@Service
//public class WasherServiceImpl implements WasherService{
//
//    @Autowired
//    private WasherRepository washerRepository;
//    @Override
//    public Washer saveWasher(Washer washer) {
//        return washerRepository.save(washer);
//    }
//
//    @Override
//    public List<Washer> fetchWasherList() {
//        return washerRepository.findAll();
//    }
//
//    @Override
//    public Washer fetchWasherById(Long washerId) {
//        return washerRepository.findById(washerId).get();
//    }
//
//    @Override
//    public void deleteWasherById(Long washerId) {
//        washerRepository.deleteById(washerId);
//    }
//
//    @Override
//    public Washer updateWasher(Long washerId, Washer washer) {
//        Washer washDB = washerRepository.findById(washerId).get();
//            if(Objects.nonNull(washer.getWasherName()) &&
//             !"".equalsIgnoreCase(washer.getWasherName())){
//       washDB.setWasherName(washer.getWasherName());
//    }
//        if(Objects.nonNull(washer.getWasherEmail()) &&
//                !"".equalsIgnoreCase(washer.getWasherEmail())){
//            washDB.setWasherEmail(washer.getWasherEmail());
//        }
//
//        if(Objects.nonNull(washer.getMobNo()) &&
//                !"".equalsIgnoreCase(washer.getMobNo())){
//            washDB.setMobNo(washer.getMobNo());
//        }
//            return washerRepository.save(washDB);
//}
//
//    @Override
//    public Washer fetchWasherByName(String washerName) {
//        return washerRepository.findByWasherNameIgnoreCase(washerName);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
