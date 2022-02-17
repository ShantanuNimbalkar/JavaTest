package com.acellere.corona.javacodechecker.ci.checkers;

import com.acellere.corona.cmx.mod.cmn.Severity;
import com.acellere.corona.cmx.msg.data.auxmod.CodeIssueModel;
import com.acellere.corona.commons.cast.ObjCaster;
import com.acellere.corona.javaparsercore.ParseContext;
import com.acellere.corona.javaparsercore.ci.ICodeIssuePublisher;
import com.acellere.corona.javaparsercore.exceptions.ParserException;
import com.acellere.corona.javaparsercore.jp.util.RegionHelper;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.type.ReferenceType;
import org.apache.commons.lang.StringUtils;

import java.util.List;

public class AvoidThrowingGenericException extends BaseChecker {

    private static final String EXCEPTION_STMT = "Exception";
    private static final String THROWABLE_STMT = "Throwable";
    private static final String ERROR_STMT = "Error";

    @Override
    protected void handleVisit(Node node, ParseContext context, ICodeIssuePublisher codeIssuePublisher) throws ParserException {
        if (node instanceof MethodDeclaration) {
            MethodDeclaration methodDeclaration = ObjCaster.castNode(MethodDeclaration.class, node);
            List<ReferenceType> listOfThrows = methodDeclaration.getThrownExceptions();
            for (ReferenceType exception : listOfThrows) {
                if (StringUtils.equals(EXCEPTION_STMT, exception.toString()) || (StringUtils.equals(THROWABLE_STMT, exception.toString()) ||
                        StringUtils.equals(ERROR_STMT, exception.toString()))) {
                     publishCodeIssue(node, context, codeIssuePublisher);
                }
            }
        }
    }


    private void publishCodeIssue(Node node, ParseContext context, ICodeIssuePublisher codeIssuePublisher) {
        codeIssuePublisher.publish(new CodeIssueModel(context.getCu().getCuFile(), RegionHelper.getRegionForNode(node).getBl(),
                Severity.high, "Avoid Throwing Generic Exception", CodeIssueNames.AVOID_THROWING_GENERIC_EXCEPTION));
    }
}
