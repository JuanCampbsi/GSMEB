package br.com.project.bean.view;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.project.geral.controller.ReceituarioController;
import br.com.project.util.all.BeanViewAbstract;

@Controller
@Scope(value="session")
@ManagedBean(name = "receituarioBeanView")
public class ReceituarioBeanView  extends BeanViewAbstract {

private static final long serialVersionUID = 1L;
	
	@Autowired
	private ReceituarioController receituarioController;
	
}
