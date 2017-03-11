package nju.editor;

import nju.editor.model.Article;
import nju.editor.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wangzehao on 2017/3/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InitArticlesTest {
    @Autowired
    ArticleService articleService;

    @Test
    public void initArticles() {
        save("南京大学软件工程领域工程硕士研究生培养方案", "培养方案", "<p style=\"font-size:15px\">一、培养目标、方向和要求</p>\n" +
                "          <p>1、培养目标</p>\n" +
                "          <p class=\"p1\">软件工程领域工程硕士的培养目标是面向国民经济信息化建设和发展的需要、面向企事业单位对软件工程技术人才的需求，培养高层次实用型、复合型软件工程技术和软件工程管理人才。</p>\n" +
                "          <p>作为一名合格的软件工程领域工程硕士获得者，应当符合国民经济信息化建设和发展需要，以及国家和企业对软件工程技术人才需求，能够成为企业所需要的高层次的软件工程技术和管理人才，其基本能力应当达到（具有国际水准的）高级程序员、系统分析和设计师、或项目管理人员的水平。</p>\n" +
                "          <p>2、培养方向</p>\n" +
                "          <p class=\"p1\">软件工程领域工程硕士应当有较宽的培养方向，包括软件工程、系统工程、领域工程、数字化技术、嵌入式软件及应用、网络工程技术、信息安全技术，以及软件项目管理、系统分析与软件设计、软件测试、软件质量保证、系统管理与支持等方向。软件学院还可以根据政府机关、企业和市场的需求，培养软件工程相关领域或交叉领域的高级人才。</p>\n" +
                "          <p class=\"p1\">在软件工程领域工程硕士研究生的培养中，部分学生希望在软件研发方面继续深入学习，也有部分学生希望能够通过学习，深入掌握在部分应用领域中运用软件工程的特定技术方法进行软件研发的理论和技能。南京大学软件学院着力于为这两类学生提供全面的培养。根据软件产业人才需求的特征，结合南京大学的办学特色和地域特点，南京大学软件工程专业将软件工程领域工程硕士研究生的课程划分为软件工程深入和应用领域深入两个方向。这种划分形式使得课程方案不仅适合于全日制软件工程硕士学历研究生，而应用领域深入方向的课程设置方案也可以随时方便地加以扩充，为针对面向领域培养或定向培养软件工程硕士研究生提供灵活的、可配置的课程方案。此外，软件学院在办学过程中，将紧密结合市场需求，动态确定并随时调整培养方向，开展针对较细节方向的人才培养，详见当年招生简章。</p>\n" +
                "          3、培养要求\n" +
                "          <p class=\"p1\">1、软件工程领域工程硕士专业学位获得者应较全面地掌握马克思主义、毛泽东思想和邓小平理论；拥护党的基本路线和方针、政策；热爱祖国，遵纪守法，品行端正，身心健康，具有良好的职业道德和创业精神，积极为我国经济建设和社会发展服务。</p>\n" +
                "          <p class=\"p1\">2、软件工程领域工程硕士专业学位获得者应具备科学的世界观，掌握科学方法与工程方法；掌握扎实的软件基础理论知识和较宽广的软件工程专业知识，具有技术创新能力；受到良好的软件工程训练，具有较强的工程实践能力和团队协作能力；熟悉软件应用和工具，具备运用先进的工程化方法、技术和工具从事某一应用领域软件分析、设计、开发、维护等工作的能力。</p>\n" +
                "          <p class=\"p1\">3、软件工程领域工程硕士专业学位获得者应达到基本的数学和语言要求；熟练掌握英语，具备良好的阅读和撰写外语资料的能力和进行国际化交流的能力；拥有较好的沟通技巧和团队工作能力，通晓和遵守相关法律和职业道德。</p>\n" +
                "          <p class=\"p1\">此外，人才还应具备以下的一般特征：\n" +
                "            <ul>\n" +
                "            <li>对软件系统、计算机系统、信息系统乃至与计算机软件相关的社会系统具有系统级的认识能力；</li>\n" +
                "            <li>具备扎实的理论基础，能够全面通晓计算机软件和软件工程的基础知识，较深入理解一个以上的计算机软件应用领域；</li>\n" +
                "            <li>动手能力强，且具有较强的系统分析和软件设计的能力，能够熟练使用两种以上主流的操作系统、数据库管理系统和程序设计语言，做到理论与实践相结合；</li>\n" +
                "            <li>能够合理认知软件科学与技术中的重要概念；</li>\n" +
                "            <li>软件工业界有过实际项目的工作经验；</li>\n" +
                "            <li>具备自学习的能力以适应软件技术的快速变化，能够通过自学的方式在较短时间内掌握系统软件的使用；</li>\n" +
                "            <li>能够综合使用各类方法、技术和工具，运用工程方法解决复杂软件问题；</li>\n" +
                "            <li>具备语言、交流、写作等基本的软件从业能力，认同现行的法律、道德和伦理。</li>\n" +
                "            </ul>\n" +
                "          </p>\n" +
                "          <p style=\"font-size:15px\">二、培养对象与入学要求</p>\n" +
                "          <p>1、培养对象</p>\n" +
                "          <p class=\"p1\">招收对象主要为具有学士学位的应届毕业生或在职工作人员，所学专业不限。申请报考者，需要较系统地掌握计算机专业基础知识、特别是计算机软件和信息技术领域的专业基础知识，具有一定的软件开发或软件项目管理等方面的经验和能力。</p>\n" +
                "\n" +
                "          <p>2、入学考试</p>\n" +
                "          <p class=\"p1\">报考人员须参加攻读软件工程领域工程硕士专业学位的入学考试。</p>\n" +
                "          <p class=\"p1\">参加1月份的全国研究生入学考试被录取者，毕业后可以授予硕士研究生毕业证书和软件工程领域工程硕士学位证书。考试科目为政治、英语、数学、专业基础和专业综合考试。专业基础考试和专业综合考试的重点是考核考生对计算机专业基础知识，特别是计算机软件与信息技术领域的专业知识的掌握程度，以及解决软件工程实际问题的能力。其中专业综合考试结合面试进行。</p>\n" +
                "\n" +
                "          <p style=\"font-size:15px\">三、培养方式及学习年限</p>\n" +
                "          <p>1、培养方式</p>\n" +
                "          <p class=\"p1\">本领域（专业）采用系统的课程学习和专设的工程实践相结合的培养方式。课程学习实行学分制；软件工程实践要求学生直接参与软件工程项目实践，完成必要的技术方案设计、软件开发、项目管理等工作，并在所取得的工程实践成果基础上完成学位论文的撰写。学位论文可以是研究论文或技术报告，以及相关的工作成果。学位论文须通过评审。</p>\n" +
                "          <p class=\"p1\">学校聘请具有丰富实践和教学指导经验的企业资深技术或管理人员参与课程教学，并对学生的软件工程实践进行联合指导。</p>\n" +
                "          <p class=\"p1\">学院提倡和特别加强双语教学，包括直接采用英文原版教材，聘请国内外高水平教师和软件专家讲课或讲学等。</p>\n" +
                "\n" +
                "          <p>2、学习年限</p>\n" +
                "          <p class=\"p1\">采用弹性学制，学习年限一般为2到4年，其中从事软件工程实践的时间不少于1学年。</p>\n" +
                "          <p class=\"p1\">在职申请硕士学位研究生可以采取边工作边学习的方式，各门课程的教学要求与全日制研究生要求相同。</p>\n" +
                "\n" +
                "          <p>3、学期制度</p>\n" +
                "          <p class=\"p1\">全日制研究生课程教学阶段为一年，设置三学期和一个暑期学校，每个学期13周。</p>\n" +
                "          <p class=\"p1\">在职申请硕士学位研究生周末上课，教学阶段基本为一年，学生可以选修全日制学生的专业课程。</p>\n" +
                "\n" +
                "          <p style=\"font-size:15px\">四、课程设置及学分要求</p>\n" +
                "          <p>1、课程设置原则</p>\n" +
                "          <p class=\"p1\">软件工程领域工程硕士课程体系应当遵循五个基本原则，即先进性、灵活性、复合性、工程性和创新性。\n" +
                "          \uF06C<ul>\n" +
                "            <li>先进性：课程设置和课程内容需反映国际上先进的技术发展成果和企业对先进技术的需求，以及相关的基础理论。</li>\n" +
                "            <li>灵活性：课程设置需具有灵活性，应根据软件技术的发展及时调整。</li>\n" +
                "            <li>复合性：课程体系需包括工程管理等方面的教学内容，使学生具有必要的综合技能和基本素质。</li>\n" +
                "            <li>工程性：课程体系的设置需面向软件工程实践的需求，强调工程实践能力培养，使学生能够自觉运用先进的工程化方法和技术从事软件开发和项目管理，具有团队协作精神。</li>\n" +
                "            <li>创新性：课程体系应当倡导学生自主学习，并给予必要的指导，从而培养学生自主学习和自我提高的能力，以及勇于开拓和善于创新的能力。</li>\n" +
                "            </ul>\n" +
                "          </p>\n" +
                "          <p>2、课程体系说明</p>\n" +
                "          <p class=\"p1\">课程体系设计应涵盖基础理论、专业知识与专业技能、职业素质等。</p>\n" +
                "          <p class=\"p1\">1、基础理论主要包括工程数学、软件工程方法等方面的基础理论知识，为学生打下坚实的理论基础。在数学方面，重点应包括概率与数理统计、现代工程数学基础等；在软件工程方法方面，重点为软件工程高级技术。</p>\n" +
                "          <p class=\"p1\">2、专业知识与专业技能主要讲授先进和实用的软件开发方法、技术和工具，并强调应用技能的训练。</p>\n" +
                "          <p class=\"p1\">3、职业素质培养主要包括语言能力、写作能力、协调管理能力、工程能力、知识产权、软件企业管理与文化等。职业素质培养不应孤立设置课程，应与具体课程教学相结合。</p>\n" +
                "          <p class=\"p1\">软件学院将根据软件技术最新发展、当前市场需求情况、学院当前培养方向、以及学生目前具备的领域知识等，灵活调整课程设置和具体课程的涵盖内容。</p>\n" +
                "\n" +
                "          <p>3、课程设置</p>\n" +
                "          <p class=\"p1\">课程学习学分总数要求为32学分。从课程结构上可分为公共基础课、学科核心课、专业核心课和专业选修课。学位课程要求为公共基础课、学科核心课和专业核心课程。学位课程强调本领域的理论基础与核心技术，选修课程注重工程能力培养，并结合市场应用需求。</p>\n" +
                "          <p class=\"p1\">为加强软件人才的国际交流能力，要求不少于二分之一的课程采用双语（或英语）教学。</p>\n" +
                "\n" +
                "          <p class=\"p1\">1）公共基础课（A类学位课）（要求5学分）。</p>\n" +
                "          <p class=\"p1\">包括以下课程：\n" +
                "            <ul>\n" +
                "            <li>研究生政治（3学分，其中：中国特色社会主义理论与实践研究，2学分；自然辩证法概论，1学分）</li>\n" +
                "            <li>研究生英语：将结合软件学院双语教学的特点，积极探索实用化英语教学改革。（2学分）</li>\n" +
                "            <li>非计算机专业本科毕业者须补修计算与软件工程和其他一门本科专业基础课(非考研课程)，不计学分。</li>\n" +
                "            </ul>\n" +
                "            </p>\n" +
                "          <p class=\"p1\">2）专业基础课程（B类学位课）（要求8学分）。\n" +
                "            <ul>\n" +
                "            <li>软件工程管理（3学分）</li>\n" +
                "            <li>软件体系结构（3学分）</li>\n" +
                "            <li>参加一门软件工程新技术研讨班（2学分）。</li>\n" +
                "            </ul>\n" +
                "            </p>\n" +
                "          <p class=\"p1\">3）专业实践课程（C类学位课）（要求6学分）。\n" +
                "            <ul>\n" +
                "            <li>敏捷软件开发（3学分）</li>\n" +
                "            <li>高级人机交互技术（3学分）</li>\n" +
                "            </ul>\n" +
                "          <p class=\"p1\">4）专业选修课程（D类学位课）（要求13学分以上）。\n" +
                "            <ul>\n" +
                "            <li>软件工程深入：软件过程改进；软件需求工程（仅限非软件工程专业本科毕业生选修）；高级经验软件工程；软件质量保障；系统分析与设计；前沿软件工程技术I；前沿软件工程技术II；软件产品规划；高级软件设计；软件工程工作坊。</li>\n" +
                "            <li>应用领域深入：高级计算机网络；云计算；数据挖掘；分布式计算系统；嵌入式系统工程；高级数据库开发技术；数据仓库与知识发现；高级电子商务；网络安全与信息安全。\n" +
                "          </li>\n" +
                "            </ul>\n" +
                "          </p>\n" +
                "          <p class=\"p1\">5）其他必需环节\n" +
                "            <ul>\n" +
                "            <li>软件工程专业实践</li>\n" +
                "            <li>论文开题报告</li>\n" +
                "            <li>论文工作中期报告</li>\n" +
                "            <li>论文预答辩</li>\n" +
                "            <li>论文答辩</li>\n" +
                "            </ul>\n" +
                "          </p> \n" +
                "          <p style=\"font-size:15px\">五、软件工程专业实践</p>\n" +
                "          <p>1、软件工程专业实践</p>\n" +
                "          <p class=\"p1\">软件工程专业实践是软件工程领域工程硕士培养的重要环节。软件工程专业实践为期36周，大多数研究生在软件企业结合具体工程项目进行软件工程专业实践，部分研究生也可在校结合教师申请的工程性项目完成软件工程专业实践。</p>\n" +
                "          <p class=\"p1\">研究生进行软件工程专业实践时，由企业中经过学校聘任的资深技术人员或业务主管负责指导，也可以由学校教师负责指导；学校工程硕士教育管理部门对此负责监督和管理。</p>\n" +
                "\n" +
                "          <p>2、软件工程专业实践的安排</p>\n" +
                "          <p class=\"p1\">学院工程发展中心对研究生软件工程专业实践进行统一安排。</p>\n" +
                "          <p class=\"p1\">全日制研究生（不含以在职/委培方式被录取的全日制研究生）由学院工程发展中心通过双向选择方式安排实习企业完成软件工程专业实践；学生也可以自行联系实习企业，但必须得到工程发展中心认定。</p>\n" +
                "          <p class=\"p1\">在职申请硕士学位研究生、以在职/委培方式被录取的学历研究生原则在本单位结合本职工作完成软件工程专业实践。经本人申请，学院也可以安排这部分研究生在软件企业或在校结合具体工程项目进行软件工程专业实践，但这部分学生必须以全脱产方式参加实习。</p>\n" +
                "          <p class=\"p1\">由于个人原因，连续两次不服从实习安排的研究生，或连续多次无企业愿意接受的研究生，学院将重新鉴定其作为合格毕业生的能力。</p>\n" +
                "\n" +
                "          <p>3、软件工程专业实践的管理</p>\n" +
                "          <p class=\"p1\">开学初为学生确定导师，第一学年在校期间由导师指导学生进行学术或工程性项目研发，第三学期学生向导师提交学术或工程性报告，经导师确认，启动实习。如导师认为报告不合格，可向学院申请延期3个月启动实习。</p>\n" +
                "          <p class=\"p1\">工程硕士研究生的实习应通过学院组织的双向选择程序，经工程发展中心批准备案后开始。实习研究生在实习期应该及时与指导教师保持联系。指导教师未及时与学生联系者须追究责任；同学对指导教师的联络置之不理者，根据其拖延期，相应顺延毕业时间。</p>\n" +
                "          <p class=\"p1\">研究生在实习期调整实习单位，必须有明确理由并报学院工程发展中心同意。凡未经批准自行调整实习单位，导致论文工作无法延续者，实习期重新计算，毕业时间相应顺延。</p>\n" +
                "\n" +
                "          <p>4、软件工程专业实践成果及评定</p>\n" +
                "          <p class=\"p1\">学院对学生的软件工程专业实践成果进行评价，并作为专业学位研究生毕业量化指标。</p>\n" +
                "          <p class=\"p1\">软件工程专业实践成果由一名具有高级职称的专家出具评审意见书。评审意见应对学生实习成果是否达到下列要求进行讨论：\n" +
                "          <ul>\n" +
                "          <li>工程性要求：项目必须为有适当规模的工程研发项目，一般不应该是预研项目或前瞻性研究项目。</li>\n" +
                "          <li>技术性要求：项目在技术性上能反映当前软件技术应用的技术发展水平。</li>\n" +
                "          <li>实用性要求：项目成果必须有明显的实际应用背景，是可运行或实施的系统。</li>\n" +
                "          <li>相对完整性要求：如果研究生参加由多人完成的较大型项目，其本人贡献必须具有相对完整性。</li>\n" +
                "          <li>独立性要求：研究生在项目中的独立贡献必须可以界定。</li>\n" +
                "          </ul>\n" +
                "          </p>\n" +
                "          <p style=\"font-size:15px\">六、研究生指导</p>\n" +
                "          <p>1、全日制研究生的指导</p>\n" +
                "          <p class=\"p1\">针对软件行业人才需求的特殊性和专业学位研究生培养的特点，学院对全日制研究生实行两级指导制度。</p>\n" +
                "          <p class=\"p1\">学院于一年级开学初为工程硕士研究生确定导师，负责学位论文指导和答辩。工程硕士研究生进入企业实践后，所参加实习项目的负责人为企业导师，负责项目管理和工作指导。研究生学位论文答辩前，须得到两位导师认可。</p>\n" +
                "\n" +
                "          <p>2、在职申请学位研究生的指导</p>\n" +
                "          <p class=\"p1\">进入软件工程专业实践的研究生，所参加实习项目的负责人为企业导师，负责项目管理和工作指导。学院指定一名论文导师，负责学位论文指导和答辩。研究生学位论文答辩前，须得到两位导师认可。</p>\n" +
                "\n" +
                "          <p style=\"font-size:15px\">七、学位论文</p>\n" +
                "          <p>1、学位论文基本要求</p>\n" +
                "          <p class=\"p1\">学位论文选题一般应直接来源于企事业单位，具有明确的应用背景和实用价值，并必须与软件工程专业实践密切相关。</p>\n" +
                "          <p class=\"p1\">论文形式可以是工程项目技术报告、关键技术的研究论文等。</p>\n" +
                "          <p class=\"p1\">项目具体方案应强调实现的先进性、合理性、技术难度、工作量和实际效果，并能体现作者综合运用科学理论、方法和技术手段解决工程实际问题的能力。在写作过程中还应体现规范化程度和文字质量。</p>\n" +
                "          <p class=\"p1\">具体要求如下：\n" +
                "            <ul>\n" +
                "            <li>选题定位于解决工程实际问题，有明确的工程应用背景和应用价值；</li>\n" +
                "            <li>有对国内外文献资料的较深层次的分析与综述；</li>\n" +
                "            <li>论文有一定的技术难度，实际工作量符合要求；</li>\n" +
                "            <li>工程设计类论文要求设计方案合理，设计结构正确，设计依据详实、可靠，设计方法体现一定的先进性，附表完整；技术研究性论文要求采用先进技术方法和现代技术手段，应用新思想、新方法；</li>\n" +
                "            <li>工程设计类论文要求能体现作者综合运用基础理论、专业知识、科学方法和技术手段分析和解决工程实际问题的知识水平；技术研究性论文要求理论推导、分析的严密性和完整性，体现作者综合运用基础理论和专业知识解决工程实际问题的水平；</li>\n" +
                "            <li>论文有新颖性、先进性、实用性，能体现一定的经济效益和社会效益；技术研究性论文还要求创新性成果或独立见解；</li>\n" +
                "            <li>论文有一定的系统性，概念清晰、结构合理、层次分明、文理通顺，图文与版式规范。</li>\n" +
                "            </ul>\n" +
                "          </p>\n" +
                "          <p>2、学位论文写作过程</p>\n" +
                "          <p class=\"p1\">学位论文写作分为选题、开题报告、中期检查、论文提交等环节。</p>\n" +
                "          <p class=\"p1\">对于在本单位结合本职工作完成论文的研究生，应在软件工程专业实践开始时立即与学位论文指导教师讨论选题，并在软件工程专业实践开始的三个月内完成开题报告。对于全日制研究生，应在软件工程专业实践开始的第四月与学位论文指导教师讨论选题，并在软件工程专业实践开始的五个月内完成开题报告。无故推迟完成开题报告，学院将对学生作延期毕业处理。</p>\n" +
                "          <p class=\"p1\">所有研究生应在学位论文答辩前三个月向学位论文指导教师提交学位论文中期进展报告，如学位论文中期检查未获通过，学院和指导教师有权推迟相关研究生的答辩。</p>\n" +
                "          <p class=\"p1\">所有研究生应在学位论文答辩前两个月向学位论文指导教师提交学位论文初稿，并在学位论文答辩前一个月向学位论文指导教师提交学位论文，以便启动软件工程专业实践成果评审、学位论文评阅等答辩前准备工作。发现学术不端行为，予以学生延期处理。</p>\n" +
                "\n" +
                "          <p>3、学位论文答辩</p>\n" +
                "          <p class=\"p1\">学位论文需通过学校组织的评审和答辩。研究生必须完成培养方案中规定的所有环节，成绩合格，方可申请参加学位论文答辩。</p>\n" +
                "          <p class=\"p1\">学位论文答辩自导师提交研究生学位论文导师意见（指导教师对研究生学位论文评语/指导教师对在职申请人的推荐信）时启动。</p>\n" +
                "          <p class=\"p1\">学位论文答辩前，学位论文应有2位专家匿名评阅并同意进行答辩。校内评阅人应为学校具有副高职以上职称的教师，校外评阅人应为学校具有副高职以上职称的教师或软件企业具有相当资历的专家。评阅专家由学院统一安排。</p>\n" +
                "          <p class=\"p1\">学位论文答辩前，指导教师应组织预答辩。</p>\n" +
                "          <p class=\"p1\">学位论文答辩委员会应由3位专家和一名秘书组成，导师应回避。3名专家应符合：两人具有教授或相当职称，一人具有副教授或相当职称；或一人具有教授或相当职称，两人具有副教授或相当职称且拥有博士学位。学位论文答辩采取表决制。学位论文答辩委员会由学院统一安排。</p>\n" +
                "\n" +
                "          <p style=\"font-size:15px\">八、毕业与学位授予</p>\n" +
                "          <p class=\"p1\">通过课程考试取得规定学分，成绩合格，并通过软件工程成果评审和学位论文答辩的研究生，由南京大学学位评定委员会审核批准后，授予软件工程领域工程硕士专业学位。其中，全日制学历研究生由南京大学发给研究生毕业证书。</p>\n");
        save("课程介绍","课程介绍",
                "            <p>\n" +
                "              <img alt=\"tupian\" src=\"images/5/123_01.png\" width=\"700\" />      \n" +
                "              <img alt=\"tupian\" src=\"images/5/123_02.png\" width=\"700\" />        \n" +
                "              <a href=\"B.html\"><img alt=\"tupian\" src=\"images/5/123_03.png\" width=\"700\" /></a>\n" +
                "              <a href=\"C.html\"><img alt=\"tupian\" src=\"images/5/123_04.png\" width=\"700\" /></a>\n" +
                "              <a href=\"D.html\"><img alt=\"tupian\" src=\"images/5/123_05.png\" width=\"700\" /></a>\n" +
                "            </p>\n" +
                "            <p><a href=\"http://218.94.159.99/\" target=\"Dlank\">当前课程</a></p>\n");
        save("奖助学金","奖助学金",
                "          <p style=\"line-height:1.6em\">&nbsp; &nbsp;&nbsp; &nbsp; 我校高度重视家庭经济困难学生资助工作，不断完善资助体系，全力拓展助困渠道，继续加大帮扶力度，切实提升育人效果，致力于让所有家庭经济困难学生在四年大学时光中能够安心学习、快乐生活和全面成长。我校始终坚持多管齐下的帮扶思路，进一步完善“奖、贷、助、补、减、缓”六位一体的助学体系，做好奖助学金、助学贷款、勤工助学、困难补助、学费减免、绿色通道等各项工作，不断加大对家庭经济困难学生的资助力度。同时，在解决家庭经济困难学生的经济、生活困难的基础上，更加关注学生的心理和精神困惑，坚持“助困与扶志”、“助困与自强”、“助困与育人”相结合的方针，通过组织爱心社团活动、开设“雨露课堂”、宣传受助学生先进典型、设立家庭经济困难学生国际交流奖学金等方式，从精神层面培养和激发家庭经济困难学生艰苦奋斗、自强不息、励志成才的人格品质，提升综合能力素质。<br /></p>\n" +
                "          <ul>\n" +
                "            <li><a href=\"http://grawww.nju.edu.cn/931/list.htm\" target=\"_blank\">研究生评奖评优</a></li>\n" +
                "            <li><a href=\"http://grawww.nju.edu.cn/932/list.htm\" target=\"_blank\">研究生三助管理</a></li>\n" +
                "            <li><a href=\"http://grawww.nju.edu.cn/933/list.htm\" target=\"_blank\">研究生助学贷款</a></li>\n" +
                "          </ul>\n");
        save("研究生培养","研究生招生",
                "          <ul>\n" +
                "            <li><a href=\"#\">2016年研究生推免通知</a></li>\n" +
                "            <li><a href=\"#\">XXXXXXXXXXXXXXXXXXXX</a></li>\n" +
                "            <li><a href=\"#\">XXXXXXXXXXXXXXXXXXXX</a></li>\n" +
                "            <li><a href=\"#\">XXXXXXXXXXXXXXXXXXXX</a></li>\n" +
                "          </ul>\n");
        save("实习基地","实习基地",
                "          <table style=\"margin-left:70px;width:550px\">\n" +
                "            <tbody>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    国家级南京软件园</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.njswp.com/\" target=\"_blank\"><img alt=\"1\" height=\"52\" src=\"images/5/20071109120715172.jpg\" width=\"170\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                   <p>\n" +
                "                     国家级江苏软件园</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.jssp.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"52\" hspace=\"0\" src=\"images/5/sjjd_clip_image003.jpg\" width=\"204\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    英特尔（中国）有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.intel.com.cn/\" target=\"_blank\"><img alt=\"1\" height=\"51\" src=\"images/5/intel.jpg\" width=\"129\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    欧特克设计软件（上海）有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.autodesk.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"27\" hspace=\"0\" src=\"images/5/sjjd_clip_image005.gif\" width=\"153\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    西门子软件系统工程（南京）有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.siemens.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"31\" hspace=\"0\" src=\"images/5/sjjd_clip_image006_0000.gif\" width=\"88\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    摩托罗拉南京软件中心</p>\n" +
                "                </td>\n" +
                "                <td style=\"text-align: left;\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.motorola.com/\" target=\"_blank\"><img align=\"middle\" alt=\"1\" height=\"47\" src=\"images/5/motorola.jpg\" width=\"85\" /></a></p>\n" +
                "                  </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    花旗软件技术服务（上海）有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.citi.com/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"57\" hspace=\"0\" src=\"images/5/sjjd_clip_image009_0000.jpg\" width=\"220\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td  style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    瑞晟半导体股份有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.realsil.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"50\" hspace=\"0\" src=\"images/5/sjjd_clip_image010_0000.jpg\" width=\"150\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td  style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    北京用友软件股份有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.ufsoft.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"37\" hspace=\"0\" src=\"images/5/sjjd_clip_image011_0000.gif\" width=\"190\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td  style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    北京汉王科技有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"cleft\">\n" +
                "                    <a href=\"http://www.hw99.com/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"65\" hspace=\"0\" src=\"images/5/sjjd_clip_image012_0000.jpg\" width=\"241\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    中国计算机软件与技术服务总公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.css.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"48\" hspace=\"0\" src=\"images/5/sjjd_clip_image013.gif\" width=\"247\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    中兴通讯股份有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                   <a href=\"http://www.zte.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"55\" hspace=\"0\" src=\"images/5/sjjd_clip_image014_0000.gif\" width=\"110\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    国电南瑞科技股份有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.nari-china.com/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"40\" hspace=\"0\" src=\"images/5/sjjd_clip_image015.gif\" width=\"248\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td  style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    安氏互联网安全系统（中国）有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.is-one.net/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"76\" hspace=\"0\" src=\"images/5/sjjd_clip_image016.gif\" width=\"167\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    江苏南大苏富特软件股份有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.njusoft.com/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"59\" hspace=\"0\" src=\"images/5/sjjd_clip_image018_0000.jpg\" width=\"234\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td  style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    江苏东大金智软件股份有限公司</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <<a href=\"http://www.wiscom.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"73\" hspace=\"0\" src=\"images/5/sjjd_clip_image019_0000.gif\" width=\"217\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td  style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    江苏自动化研究所</p>\n" +
                "                </td>\n" +
                "                <td>\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.716.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"62\" hspace=\"0\" src=\"images/5/sjjd_clip_image021_0000.jpg\" width=\"206\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    移软科技(南京)有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <span lang=\"EN-US\"><a href=\"http://www.mobilesoft.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"58\" hspace=\"0\" src=\"images/5/sjjd_clip_image022_0000.gif\" width=\"223\" /></a></span></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    南京国瑞科技有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.gori.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"27\" hspace=\"0\" src=\"images/5/sjjd_clip_image022_0001.gif\" width=\"180\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    南京力导电子系统研究所</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.njlead.com/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"69\" hspace=\"0\" src=\"images/5/sjjd_clip_image025_0000.jpg\" width=\"248\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td  style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    苏源集团江苏信息技术有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.suyuan.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"75\" hspace=\"0\" src=\"images/5/sjjd_clip_image026_0000.jpg\" width=\"188\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td  style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    擎天咨询科技有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.skynj.com/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"51\" hspace=\"0\" src=\"images/5/sjjd_clip_image039.gif\" width=\"156\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    三星电子(中国)研发中心</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.samsung.com.cn/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"44\" hspace=\"0\" src=\"images/5/sjjd_clip_image040.gif\" width=\"160\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td  style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    华瑞电气</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.huarui-china.com/\" target=\"_blank\"><img alt=\"1\" border=\"0\" height=\"74\" hspace=\"0\" src=\"images/5/sjjd_clip_image041.jpg\" width=\"204\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    深圳市紫金支点技术股份有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.zjft.com/\" target=\"_blank\"><img alt=\"2\" border=\"0\" height=\"71\" hspace=\"0\" src=\"images/5/20071109112639104.jpg\" width=\"189\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    扬智电子（上海）有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.ali.com.tw/t_chinese/about/index.html\" target=\"_blank\"><img align=\"absMiddle\" alt=\"1\" height=\"70\" src=\"images/5/yangzhilogo.jpg\" width=\"193\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    趋势科技中国有限公司南京分公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://tw.trendmicro.com/tw/home/\" target=\"_blank\"><img align=\"middle\" alt=\"1\" height=\"61\" src=\"images/5/qushi.JPG\" width=\"218\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    南京百敖软件有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.byosoft.com.cn/\" target=\"_blank\"><img alt=\"1\" height=\"85\" src=\"images/5/baiao.JPG\" width=\"194\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    无锡矽太恒科电子有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.ihanker.com/\" target=\"_blank\"><img alt=\"1\" height=\"65\" src=\"images/5/xitai.JPG\" width=\"192\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    南京爱立信熊猫通讯有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.jswzxx.net/web/enc.htm\" target=\"_blank\"><img alt=\"1\" height=\"59\" src=\"images/5/xiongmaoaolixin.JPG\" width=\"239\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    SAP研究总部&middot;中国研究中心</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.bestsapchina.com/ResourceMain.aspx?utm_source=CNY-se&amp;utm_medium=ggl&amp;utm_term=ggp&amp;utm_content=D0031&amp;utm_campaign=CNY&amp;srcid=1_3-10-21_3-10-21_SEMLRWG1&amp;campaigncode=CRM-AP09-DGH-CNSEMLRWG1&amp;source=msgsdkwcn01&amp;kw=2000029&amp;KW_ID=p167075849&amp;typeid=3&amp;membersource=whitepaper\" target=\"_blank\"><img alt=\"1\" height=\"63\" src=\"images/5/sap.JPG\" width=\"203\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    IBM</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.ibm.com/cn/zh/\" target=\"_blank\"><img alt=\"1\" height=\"51\" src=\"images/5/ibm.JPG\" width=\"133\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    腾讯科技有限公司</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://software.nju.edu.cn/www.qq.com\" target=\"_blank\"><img alt=\"1\" height=\"45\" src=\"images/5/tengxun.JPG\" width=\"222\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "              <tr>\n" +
                "                <td style=\"text-align: left;\" width=\"276\">\n" +
                "                  <p>\n" +
                "                    EBAY</p>\n" +
                "                </td>\n" +
                "                <td width=\"258\">\n" +
                "                  <p align=\"left\">\n" +
                "                    <a href=\"http://www.ebay.cn/online/\" target=\"_blank\"><img alt=\"1\" height=\"69\" src=\"images/5/yibei.JPG\" width=\"240\" /></a></p>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "            </tbody>\n" +
                "          </table>\n");
        save("实习规定","实习规定",
                "            <p>\n" +
                "              <a href=\"images/5/shijianguiding.doc\" target=\"_blank\">南京大学软件学院关于学生工程实践管理暂行规定</a></p>\n" +
                "            <p>\n" +
                "              <a href=\"images/5/shijianshenqing.doc\" target=\"_blank\">南京大学软件学院学生工程实践申请表</a></p>\n" +
                "            <p>\n" +
                "              <a href=\"images/5/waichuxieyi.doc\" target=\"_blank\">南京大学软件学院学生外出实践协议书</a></p>\n" +
                "            <p>\n" +
                "              <a href=\"images/5/shijianxieyi.doc\" target=\"_blank\">南京大学软件学院学生工程实践协议书</a></p>\n" +
                "            <p>\n" +
                "              <a href=\"images/5/shixibaogao.docx\" target=\"_blank\">南京大学软件学院学生实习（阶段）总结报告</a></p>\n" +
                "            <p>\n" +
                "              <a href=\"images/5/danweipingjia.docx\" target=\"_blank\">南京大学软件学院学生实习单位评价表</a></p>\n" +
                "            <p>\n" +
                "              <a href=\"images/5/gctxieyi.pdf\" target=\"_blank\">南京大学软件学院关于在企业建立软件工程硕士实践基地的协议书</a></p>\n" +
                "            <p>\n" +
                "              <a href=\"images/5/zhishichanquan.pdf\" target=\"_blank\">南京大学软件学院学员工程实践知识产权及保密协议书</a></p>\n" +
                " \n" +
                "            <p>\n" +
                "              <span>实习流程</span>：</p>\n" +
                "            <p>\n" +
                "               <img alt=\"tupian\" height=\"958\" src=\"images/5/liucheng.jpg\" width=\"569\" /></p>\n");
        save("南京大学软件学院2015届就业统计","就业情况","<img src=\"images/5/20151.png\">\n" +
                "            <br/>\n" +
                "            <br/>\n" +
                "            <br/>\n" +
                "            <br/>\n" +
                "            <img src=\"images/5/20152.png\">\n");
        save("南京大学软件学院2016届就业统计","就业情况","<img src=\"images/5/20161.png\">\n" +
                "            <br/>\n" +
                "            <br/>\n" +
                "            <br/>\n" +
                "            <br/>\n" +
                "            <img src=\"images/5/20162.png\">\n");
        save("校园文化","校园文化","<div class=\"gallery cf\">\n" +
                "            <div>\n" +
                "              <img src=\"images/1/1.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/3.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/4.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/5.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/6.png\" />\n" +
                "            </div>\n" +
                "          </div>\n");
        save("校友风采","校友风采","<div class=\"gallery cf\">\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2016.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2015.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2014.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2013.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2012.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2011.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2010.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2009.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2008.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2007.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2006.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2005.png\" />\n" +
                "            </div>\n" +
                "            <div>\n" +
                "              <img src=\"images/1/2004.png\" />\n" +
                "            </div>\n" +
                "          </div>\n");
        save("H. Zhang:Spot Pricing in the Cloud Ecosystem: A Comparative Investigation","学术动态","H. Zhang:Spot Pricing in the Cloud Ecosystem: A Comparative Investigation");
        save("H. Zhang:On the Communication Variability Analysis of the NeCTAR Research Cloud System","学术动态","H. Zhang:On the Communication Variability Analysis of the NeCTAR Research Cloud System");
        save("校领导鼓楼校区值班表（12月5日--12月9日）","公告信息","校领导鼓楼校区值班表（12月5日--12月9日）");
        save("校长办公室关于2016—2017学年第一学期期末教学工作的通知","公告信息","校长办公室关于2016—2017学年第一学期期末教学工作的通知");
        save("南京大学本科招生宣传创意征集启事","公告信息","南京大学本科招生宣传创意征集启事");
        save("校领导鼓楼校区值班表（12月12日——12月16日）","公告信息","校领导鼓楼校区值班表（12月12日——12月16日）");
    }

    private void save(String title, String type, String html) {
        Article article = new Article();
        article.setType(type);
        article.setTitle(title);
        article.setHtml(html);
        articleService.saveArticle(article);
        articleService.releaseArticle(article);
    }
}
