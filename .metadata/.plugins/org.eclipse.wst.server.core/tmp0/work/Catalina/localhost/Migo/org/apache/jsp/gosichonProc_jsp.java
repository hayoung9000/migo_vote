/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2018-05-18 15:20:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gosichonProc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style>\n");
      out.write(".box {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\twidth: 340px;\n");
      out.write("\tmargin: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("\twidth: 340px;\n");
      out.write("\theight: 300px;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("\tlist-style: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tpadding-left: 7px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#name {\n");
      out.write("\tfont-size: 17px;\n");
      out.write("\tline-height: 19px;\n");
      out.write("\tfont-weight: 900;\n");
      out.write("\tcolor: #404040;\n");
      out.write("\tmargin-bottom: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#explain {\n");
      out.write("\tfont-size: 13px;\n");
      out.write("\tline-height: 13px;\n");
      out.write("\tcolor: #757575;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#time {\n");
      out.write("\tmargin-top: 5px;\n");
      out.write("\tline-height: 19px;\n");
      out.write("\tfont-weight: 900;\n");
      out.write("\tcolor: #ff9933;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li class=\"box\"><a href=\"dabuzzi.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/dabuzzi_f.jpg\"> <span id=\"name\">다부찌</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">얼큰한 부대찌개와 바삭한 감자튀김의 조화</span> <span id=\"time\">10분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"sam.jsp\"> <img src=\"image/sam_f.jpg\">\n");
      out.write("\t\t\t\t<span id=\"name\">삼동이</span> <span id=\"explain\">퓨전 삼겹살 덮밥</span> <span\n");
      out.write("\t\t\t\tid=\"time\">13분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"hong.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/hong_f.jpg\"> <span id=\"name\">홍오로</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">불맛 가득 퓨전 중화 음식</span> <span id=\"time\">10분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"sambong.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/sambong_f.jpg\"> <span id=\"name\">삼봉</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">밥이 무한리필인 김치찌개 메뉴가 대표</span> <span id=\"time\">11분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"dduck.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/dduck_f.jpg\"> <span id=\"name\">빨강떡볶이</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">매운맛 단계가 있는 저렴한 떡볶이</span> <span id=\"time\">11분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"hot.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/hot_f2.jpg\"> <span id=\"name\">엽기떡볶이</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">대한민국 대표 매운 떡볶이</span> <span id=\"time\">15분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"mom.jsp\"> <img src=\"image/mom_f.jpg\">\n");
      out.write("\t\t\t\t<span id=\"name\">큰엄마네떡볶이아울렛</span> <span id=\"explain\">넓은 인원 회식\n");
      out.write("\t\t\t\t\t가능한 떡볶이집</span> <span id=\"time\">2분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"mirim.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/mirim_f.JPG\"> <span id=\"name\">미림분식</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">이름부터 미림인 즉석떡볶이집</span> <span id=\"time\">2분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"pork.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/pork_f.jpg\"> <span id=\"name\">이쁜돼지고기</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">삼겹살과 목살 무한리필</span> <span id=\"time\">14분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"chiken.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/chiken_f.jpg\"> <span id=\"name\">맛닭꼬</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">오븐에 구운 담백한 치킨</span> <span id=\"time\">11분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"amasvin.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/amasvin_f2.jpg\"> <span id=\"name\">아마스빈</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">달콤 쫀득 버블티, 타피오카펄로 든든한 간식</span> <span id=\"time\">7분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"waffle.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/waffle_f.jpg\"> <span id=\"name\">바바플</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">저렴한 가격으로 맛보는 수제 와플</span> <span id=\"time\">11분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"bananau.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/bananau_f.jpg\"> <span id=\"name\">바나나유</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">떠오르는 신흥강자! 생바나나 음료</span> <span id=\"time\">9분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"gggo.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/gigigo_f.jpg\"> <span id=\"name\">지지고</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">일본식 볶음 컵요리</span> <span id=\"time\">10분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"alchon.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/alchon_f.jpg\"> <span id=\"name\">알촌</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">맛과 가격 모두 잡은 알밥</span> <span id=\"time\">11분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"duckbong.jsp\"> <img\n");
      out.write("\t\t\t\tsrc=\"image/duckbong_f.jpg\"> <span id=\"name\">덕봉식당</span> <span\n");
      out.write("\t\t\t\tid=\"explain\">주문 즉시 조리하는 뜨끈한 집밥 음식</span> <span id=\"time\">9분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"sin.jsp\"> <img src=\"image/sin_f.jpg\">\n");
      out.write("\t\t\t\t<span id=\"name\">신전떡볶이</span> <span id=\"explain\">매콤한 국물 떡볶이</span> <span\n");
      out.write("\t\t\t\tid=\"time\">14분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\t\t<li class=\"box\"><a href=\"kim.jsp\"> <img src=\"image/kim_f.jpg\">\n");
      out.write("\t\t\t\t<span id=\"name\">김밥천국</span> <span id=\"explain\">번외) 저녁으로 최고인\n");
      out.write("\t\t\t\t\t만능 식당</span> <span id=\"time\">2분</span>\n");
      out.write("\t\t</a></li>\n");
      out.write("\n");
      out.write("\t</ul>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
