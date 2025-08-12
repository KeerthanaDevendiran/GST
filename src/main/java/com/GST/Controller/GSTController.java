package com.GST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GST.Entity.GSTEntity;
import com.GST.Service.GSTService;

//hi

	@RestController
	@RequestMapping(value="/gst/api")
	public class GSTController {
		@Autowired
		GSTService gs;
		 @PostMapping(value="/postpro")
		 public String postpro(@RequestBody GSTEntity e) {
			 return gs.postpro(e);
		 }
		@PostMapping(value="/postlistpro")
		public String postAll(@RequestBody List<GSTEntity> e) {
			return gs.postAll(e);

		 }
		@GetMapping(value="/getall")
		public List<GSTEntity> getall() {
			return gs.getall();
		}
		@GetMapping(value="/query/{a}")
		public Integer getquery(@PathVariable String a) {
			return gs.getquery(a);
		}
		

}
