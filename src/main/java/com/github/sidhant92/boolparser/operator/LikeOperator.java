package com.github.sidhant92.boolparser.operator;

import com.github.sidhant92.boolparser.constant.ContainerDataType;
import com.github.sidhant92.boolparser.constant.DataType;
import com.github.sidhant92.boolparser.constant.Operator;

import java.util.Optional;

public class LikeOperator extends AbstractOperator{

    @Override
    public <T extends Comparable<? super T>> boolean evaluate(final ContainerDataType containerDataType, final DataType dataType,
                                                              final Object leftOperand, final Object... rightOperands) {
        final Optional<T> leftValueOptional = containerDataType.getValue(dataType, leftOperand);
        final Optional<T> rightValueOptional = containerDataType.getValue(dataType, rightOperands[0]);
        return leftValueOptional.flatMap(leftValue -> rightValueOptional.map(leftValue::compareTo).map(a -> a != 0)).orElse(false);
    }

    @Override
    public Operator getOperator() {
        return Operator.LIKE;
    }

    @Override
    public String getSymbol() {
        return ":";
    }
}
