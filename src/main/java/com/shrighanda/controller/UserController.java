package com.shrighanda.controller;


import com.shrighanda.entity.Member;
import com.shrighanda.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private IUserService userService;

    @GetMapping("register")
	public String registerForm(Model model) {
	    model.addAttribute("member",new Member());
		return "member_register";
	}

    @PostMapping("register")
    public String registerSubmitForm(@ModelAttribute Member member)
    {
        userService.addMember(member);
        return "result";
    }

    @GetMapping("members")
    public String getMembers(Model model) {
        model.addAttribute("members",userService.getAllmembers());
        return "members";
    }
	/*@PostMapping("member")
	public ResponseEntity<Void> addArticle(@RequestBody Member member, UriComponentsBuilder builder) {
        userService.addMember(member);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/member/{id}").buildAndExpand(member.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("member")
	public ResponseEntity<Member> updateArticle(@RequestBody Member member) {
		userService.updateMember(member);
		return new ResponseEntity<Member>(member, HttpStatus.OK);
	}

	@DeleteMapping("member/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		userService.deleteMember(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}
	@GetMapping("members")
	public ResponseEntity<List<Member>> getAllMembers() {
		List<Member> list = userService.getAllmembers();
		return new ResponseEntity<List<Member>>(list, HttpStatus.OK);
	}
*/
} 