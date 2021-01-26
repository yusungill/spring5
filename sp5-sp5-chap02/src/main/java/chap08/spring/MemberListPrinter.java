package chap08.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("listPrinter")
public class MemberListPrinter {

	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrinter() {
	}

	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Autowired
	@Qualifier("summaryPrinter")
	public void setMemberPrinter(MemberSummaryPrinter printer) {
		this.printer = printer;
	}
}
