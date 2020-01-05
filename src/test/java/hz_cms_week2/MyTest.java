package hz_cms_week2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.bean.Book;
import com.bw.mapper.BooksMapper;
import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		BooksMapper mapper = ac.getBean(BooksMapper.class);
		List<Object[]> list = IOUtils.readFile("b.txt", "\\|");
		for (Object[] objects : list) {
			if (!StringUtil.isPhone(objects[3] + "")) {
				mapper.adde(Integer.parseInt(objects[0] + ""), 0);
			} else if (!StringUtil.isNumber(objects[5] + "")) {
				mapper.adde(Integer.parseInt(objects[0] + ""), 1);
			} else {
				Book b = new Book(Integer.parseInt(objects[0] + ""), objects[1] + "", objects[2] + "", objects[3] + "",
						objects[4] + "", objects[5] + "");
				mapper.add(b);
			}
		}
	}
}
