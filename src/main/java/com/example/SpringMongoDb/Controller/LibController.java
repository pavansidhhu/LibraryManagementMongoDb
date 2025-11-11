package com.example.SpringMongoDb.Controller;

import com.example.SpringMongoDb.Repository.LibraryRepo;
import com.example.SpringMongoDb.Service.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class LibController {
    @Autowired
    private LibraryRepo lib1;
 List<Library> libraryList=new ArrayList<>();
    @RequestMapping(value="/get",method = RequestMethod.GET)
    public List<Library> getLibraryList() {
        return lib1.saveAll(libraryList);
    }
    @RequestMapping(value="/getid/{id}",method = RequestMethod.GET)
    public List<Library> getLibraryListget() {
        return lib1.saveAll(libraryList);
    }
    @RequestMapping(value="/post",method=RequestMethod.POST)
    public List<Library> postLibraryList(@RequestBody Library lib){
           libraryList.add(lib);
       return lib1.saveAll(libraryList);
    }
    @RequestMapping(value="/del/{name}",method=RequestMethod.DELETE)
    public List<Library> delLibraryList(String name ){
        for(Library lib:libraryList){
            if(lib.getName().equals(name)){
                libraryList.remove(name);
            }
        }
        return lib1.saveAll(libraryList);
    }
}
